package com.WebTableTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebTableDataHandlingextendsBaseTest extends BaseTest{

	@Test(priority=1,description=" Capturing the WebTable data Dynamically ")
public void DynamicWebTableDataHandling() throws IOException
{
		FileInputStream testDataFile=new FileInputStream("./src/com/TestData/WebTableSingleTestData.xlsx");
		XSSFWorkbook testDataWorkBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = testDataWorkBook.getSheet("Sheet1");
		
		// Identifying the WebTable
		// /html/body/div[5]/section[1]/div
		// /html/body/div[5]/section[1]/div/section/div[1]
		
		By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
		WebElement webTable=driver.findElement(webTableProperty);
		
		By rowProperty=By.tagName("tr");
		List<WebElement>webTableRows=webTable.findElements(rowProperty);
		
		// going to every Row of the WebTable
        for(int rowIndex=0;rowIndex<webTableRows.size();rowIndex++)
        {
        	WebElement webTableRow=webTableRows.get(rowIndex);
        	Row newRow=testDataSheet.createRow(rowIndex);
        	
        	// find the number of Row of Cells
        	By rowOfCellProperty=By.tagName("td");
        	
           // finding the Number of Cells in the Row
        	List<WebElement>rowOfCells=webTableRow.findElements(rowOfCellProperty);
        	
        	// going to a row - to all the cells
            for(int rowOfCellIndex=0; rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
            {
            	Cell newRowOfNewCell=newRow.createCell(rowOfCellIndex); // creating a row of Cell

            	WebElement rowOfCellData=rowOfCells.get(rowOfCellIndex);
            	String rowOfCellDataText=rowOfCellData.getText();
            	System.out.print(rowOfCellDataText+"   ");

            	newRowOfNewCell.setCellValue(rowOfCellDataText); // sending the data into the row of cell
            	}
            	FileOutputStream testDataOutPutFile = new FileOutputStream("./src/com/TestData/WebTableSingleTestData.xlsx");
            	testDataWorkBook.write(testDataOutPutFile);

            	System.out.println();

            	}

            }
		
		
		
		
}


