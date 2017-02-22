package com.wincher.factory;

public class ExportHtmlFactory implements ExportFactory {

	@Override
	public ExportFile factory(EXPORT_TYPE exportType) {
		if (EXPORT_TYPE.STANDARD == exportType) {
			return new ExportStandardHtmlFile();
		} else if (EXPORT_TYPE.FINANCIAL == exportType) {
			return new ExportFinancialHtmlFile();
		} else {
			throw new RuntimeException("没有找到对象");
		}
	}

}
