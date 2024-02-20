package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream multipleTestDataFile = new FileInputStream("./src/com/ExcelOperations/ExcelTestDataFiles/MultipleTestData.xlsx");
		                                                           
        //./src/com/ExceTestDataFiles/MultipleTestData.xlsx
		XSSFWorkbook workBook = new XSSFWorkbook(multipleTestDataFile);

		XSSFSheet testDataSheet = workBook.getSheet("MultipleTestData");

		// In the Sheet identifying the Number of Active Rows with the data
		int RowsCount=testDataSheet.getLastRowNum();
		
		System.out.println(RowsCount);

		// Should go automatically to every Active Row
		for(int rowIndex=0;rowIndex<=RowsCount;rowIndex++)
		{
		// should goto an active Row
		Row row=testDataSheet.getRow(rowIndex);

		// Going to an active Row and identifying the number of active Cells
		int  rowOfCellCount=row.getLastCellNum();

		// going to an active row to all its active Cells
		for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCellCount;rowOfCellIndex++ )
		{
		// going to an active Row of its active Cell
		Cell rowOfCell=row.getCell(rowOfCellIndex);

		// get the data from the Row of the Cell
		String data=rowOfCell.getStringCellValue();

		// print the data of the Excel Sheet into Eclipse Console
		System.out.print(data+" | |");

		}

		System.out.println();
		}
		
		
	}

}
