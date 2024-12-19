package com.Datadrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Datadrivencreate {
public static void mains(String[] args) throws IOException {
		
		File aFile = new File("C:\\Users\\Hp\\Desktop\\WriteData.xls");
		FileInputStream b = new FileInputStream(aFile);
		Workbook c = new HSSFWorkbook(b);
		Sheet sheet2 = c.createSheet("Data");
		Row row = sheet2.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Hello");
		FileOutputStream e = new FileOutputStream(aFile);
		c.write(e);

	}}


