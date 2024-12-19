package com.Datadrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_GetConcept {
	public static void main(String args[]) throws IOException {
		File aFile = new File("C:\\Users\\Hp\\Desktop\\Demo.xlsx");
		FileInputStream bFile = new FileInputStream(aFile);
		Workbook w = new XSSFWorkbook(bFile);
		Sheet s = w.getSheet("Data");
		int NumberOfRows = s.getPhysicalNumberOfRows();
		for(int i=0; i<NumberOfRows; i++) {
			Row row = s.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0; j<numberOfCells; j++) {
				Cell c = row.getCell(j);
				CellType type = c.getCellType();
				
				if(type.equals(CellType.STRING)) {
					String value = c.getStringCellValue();
					System.out.println(value);
				}
				
				if(type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int num = (int)d;
					System.out.println(num);
					
					
				}}
		}
	}}

	

