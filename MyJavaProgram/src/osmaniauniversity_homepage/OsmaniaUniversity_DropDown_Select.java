package osmaniauniversity_homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class OsmaniaUniversity_DropDown_Select {

	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";

	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void applicationClose()
	{
	driver.close();
	}
	public void dropDownOptionalValueSelection()
	{
	// id="gtranslate_selector" - Select Language DropDown Property
	By selectDropDownProperty=By.id("gtranslate_selector");
	WebElement selectDropDown=driver.findElement(selectDropDownProperty);


	/*

	// <option value="en|hi">Hindi</option>
	// <option value="en|de">German</option>
	// <option value="en|fr">French</option>

	Finding all the Optional Values of the DropDown
	By dropDownLaunguagesProperty=By.tagName("option");
	//List<WebElement>dropDownLaunguages=driver.findElements(dropDownLaunguagesProperty);

	List<WebElement>dropDownLaunguages=selectDropDown.findElements(dropDownLaunguagesProperty);
	int dropDownLaunguagesCount=dropDownLaunguages.size();

	for(int index=0;index<dropDownLaunguagesCount;index++)
	{
	//if(dropDownLaunguages.get(index).isDisplayed()) //isDisplayed() method returns boolean type of value
	//{
	String dropDownLanguage=dropDownLaunguages.get(index).getText();
	System.out.println(index+" "+dropDownLanguage);
	//}
	}

	*/
	
	Select selection = new Select(selectDropDown);
	//selection.selectByIndex(7);
	// <option value="en|hi">Hindi</option>
	// selection.selectByValue("en|hi");// Argument should be passed as of type String
	selection.selectByVisibleText("Malayalam");

	// Deselection of selected Optional values
	selection.deselectByIndex(8);
	selection.deselectByVisibleText("Hindi");
	// <option value="en|te">Telugu</option>
	selection.deselectByValue("en|te");

	// DeSelection of all the selected optional values at once
	selection.deselectAll();

	//selectDropDown.click();
	}

	public static void main(String[] args) {

	OsmaniaUniversity_DropDown_Select dropDownSelection = new OsmaniaUniversity_DropDown_Select();
	dropDownSelection.applicationLaunch();
	dropDownSelection.dropDownOptionalValueSelection();

	// dropDownSelection.applicationClose();


	}

	}

