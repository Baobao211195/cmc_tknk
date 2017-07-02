package com.tkhq.cmc.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompileNameExcel {

	@SuppressWarnings("unchecked")
	public <T> T convertColumnName(String pathFile) throws IOException{
		
		FileInputStream inputStream = new FileInputStream(new File(pathFile));
		XSSFWorkbook book = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = book.getSheetAt(0);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<sheet.getRow(0).getLastCellNum() -1 ; i++){
			String v = CellReference.convertNumToColString(i);
			sb.append(v + ",");
		}
		sb.append(CellReference.convertNumToColString(sheet.getRow(0).getLastCellNum()));
		inputStream.close();
		return (T) sb;
	}
}
