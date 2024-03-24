package com.exceltestdata;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class Excel_test_SingleTestData {

	public static void main(String[] args) throws IOException {
		//Identify the excel file in the system
FileInputStream excelTestDataFile=new FileInputStream("./src/main/java/src/com/TestData/TestData.xlsx");		
// Identify the workbook in the excel
 XSSFWorkbook excelworkbook=new XSSFWorkbook(excelTestDataFile);
 
 //Identify a particular sheet in the workbook
 XSSFSheet WorkBookSheet=excelworkbook.getSheet("Sheet1");
 
  //Identify the Row of the sheet
  Row sheetRow=WorkBookSheet.getRow(0);
  
  
  //Identify the Row of a cell in the sheet
     Cell rowofCell=sheetRow.getCell(0);
    
     //get the data from the row of a cell
     String testData=rowofCell.getStringCellValue();
     System.out.println(testData);
 

	}
}
