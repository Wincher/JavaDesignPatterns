package com.wincher.factory;

public interface ExportFactory {
	enum EXPORT_TYPE{ STANDARD, FINANCIAL}
	ExportFile factory(EXPORT_TYPE exportType);
}
