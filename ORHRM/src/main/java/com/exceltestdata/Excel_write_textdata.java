package com.exceltestdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_textdata {
	public static void main(String[] args) throws IOException {
		//Identify the excel file in the system
FileInputStream excelTestDataFile=new FileInputStream("./src/com/TestData/TestData.xlsx");		
// Identify the workbook in the excel
 XSSFWorkbook excelworkbook=new XSSFWorkbook(excelTestDataFile);
 
 //Identify a particular sheet in the workbook
 XSSFSheet WorkBookSheet=excelworkbook.getSheet("Sheet1");
 
  //Creating a particular Row in the sheet
  Row sheetofNewRow=WorkBookSheet.createRow(6);
  
  //Creating a particular Row of a Cell
     Cell newrowofCell=sheetofNewRow.createCell(4);
     
    //Set a Value into the new row of a new cell created
     newrowofCell.setCellValue("DurgaPrasad");
     
     //Saving the Excel File along With WorkBook
     FileOutputStream saveexcelTestDataFile=new FileOutputStream("./src/com/TestData/TestData.xlsx");
    		 
     excelworkbook.write(saveexcelTestDataFile);
     
     
     
	}
}
