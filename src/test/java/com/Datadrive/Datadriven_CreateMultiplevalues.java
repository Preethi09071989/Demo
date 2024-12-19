package com.Datadrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_CreateMultiplevalues {
	public static void main(String[] args) throws IOException {
		File aFile = new File("C:\\Users\\Hp\\Desktop\\Createdata.xlsx");
		FileInputStream b = new FileInputStream(aFile);
		Workbook c = new XSSFWorkbook(b);
        Sheet s = c.createSheet("Data");
        Row row = s.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello");
        s.createRow(1).createCell(2).setCellValue("Welcome");
        s.createRow(2).createCell(3).setCellValue("Welcome");
        FileOutputStream e = new FileOutputStream(aFile);
        c.write(e);
      
}}
