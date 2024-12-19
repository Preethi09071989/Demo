package com.Datadrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.spi.AbstractResourceBundleProvider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Concept {
public static void main(String[] args) throws IOException {
	File aFile = new File("C:\\Users\\Hp\\Desktop\\Demo.xlsx");
	FileInputStream bFile = new FileInputStream(aFile);
	Workbook cWorkbook = new XSSFWorkbook(bFile);
	Sheet s = cWorkbook.getSheet("Data");
	Row r = s.getRow(2);
	Cell c = r.getCell(0);
	CellType type = c.getCellType();
	
	if(type.equals(CellType.STRING)) {
	String value = c.getStringCellValue();
	System.out.println(value);
	
	}
	else if(type.equals(CellType.NUMERIC)){
		double d = c.getNumericCellValue();
		int num = (int) d;
		System.out.println(num);
	}
	
	
	
	
}
}
