package com.wincher.factory;

import com.wincher.factory.ExportFactory.EXPORT_TYPE;

public class ExportPdfFactory implements ExportFactory {

	@Override
	public ExportFile factory(EXPORT_TYPE exportType) {
		if (EXPORT_TYPE.STANDARD == exportType) {
			return new ExportStandardPdfFile();
		} else if (EXPORT_TYPE.FINANCIAL == exportType) {
			return new ExportFinancialPdfFile();
		} else {
			throw new RuntimeException("没有找到对象");
		}
	}

}
