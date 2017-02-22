package com.wincher.factory;

import com.wincher.factory.ExportFactory.EXPORT_TYPE;

public class Client {
	public static void main(String[] args) {
		String data = "a";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory(EXPORT_TYPE.FINANCIAL);
        ef.export(data);
	}
}
