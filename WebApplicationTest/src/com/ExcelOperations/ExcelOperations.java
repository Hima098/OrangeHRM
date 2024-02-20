package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


 public class ExcelOperations {


	  public void Reuse() throws IOException {
		// TODO Auto-generated method stub
		//// Identify the file(Excel) in the System
		//FileInputStream excelTestDataFile = new FileInputStream("./src/com/ExceTestDataFiles/SingleTestData.xlsx");

		FileInputStream file = new FileInputStream("./src/com/ExcelOperationsfiles/Addemploytestdata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet testdatasheet=workbook.getSheet("AddEmployee with Multipledata");
		Row rowOfSheet=testdatasheet.getRow(0);
		Cell rowOfCell=rowOfSheet.getCell(1);
		 String data=rowOfCell.getStringCellValue();
		System.out.println(data);
		Cell newCellOfRow=rowOfSheet.createCell(3);
		newCellOfRow.setCellValue("Hima");
		FileOutputStream textoutput=new FileOutputStream("./src/com/ExcelOperationsfiles/testdata.xlsx");
		workbook.write(textoutput);
		
		
		
		
		
		

	}

}
