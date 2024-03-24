package WebTableTesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingCompleteWebTableDataextendsBaseTest extends BaseTest {

	@Test(priority=1,description=" Getting the complete WebTable Data from the Application")
	public void capturingCompleteWebTableData()
	{
	// First Row of First Cell
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// Last Row of Last Cell
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
		
	String xpathExpession1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpression2="]/td[";
	String xpathExpression3="]";

	// going to every Row of the WebTable
	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	// going to a Row and internally going every Row of the Cell
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	By webTableDataProperty=By.xpath(xpathExpession1+rowIndex+xpathExpression2+rowOfCellIndex+xpathExpression3);
	WebElement webTableData=driver.findElement(webTableDataProperty);
	String webTableRowOfCellData=webTableData.getText();
	System.out.print(webTableRowOfCellData+"    ");
	}
	System.out.println();
	}







	}

	}
