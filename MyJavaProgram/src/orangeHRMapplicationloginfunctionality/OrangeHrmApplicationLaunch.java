package orangeHRMapplicationloginfunctionality;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmApplicationLaunch {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		//Driver chromeDriver=new Driver();
		WebDriver driver=new ChromeDriver();
		
 String apllicationurlAddress ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
 
 http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login
	 driver.get(apllicationurlAddress);
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 String expectedorangehrmhomepagetitle="OrangeHRM";
 
 System.out.println("the expected title of the orangehrm home page is:"+expectedorangehrmhomepagetitle);
 
 String actualrangehrmhomepagetitle=driver.getTitle();

 System.out.println("the actual title of the orangehrm home page is:"+actualrangehrmhomepagetitle);
		 
 if(actualrangehrmhomepagetitle.equals(expectedorangehrmhomepagetitle))
	{
	System.out.println("the orangehrm home page  title matched  -PASS");



		}
	else
	{
		System.out.println("theorangehrm home page  title NOT matched  -PASS");
	}	
		
		String expectedorangehrmhomepageUrlAddres="http://127.0.0.1/orangehrm-4.2.0.1";
		
		System.out.println("The Expected urlAddress of the orangehrm Homepage is: "+expectedorangehrmhomepageUrlAddres);
		
		String actualorangehrmhomepageUrlAddres=driver.getCurrentUrl();
		
		System.out.println("The actual urlAddress of orangehrm Homepage is:- "+actualorangehrmhomepageUrlAddres);

		if(actualorangehrmhomepageUrlAddres.contains(expectedorangehrmhomepageUrlAddres))
		
		{
			
		System.out.println("the orangehrm Homepage UrlAddress matched  -PASS");



			}
		else
		{
			System.out.println("the orangehrm Homepage UrlAddress NOT matched  -Fail"); 

			
		}
			//<input name="txtUsername" id="txtUsername" type="text">
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
 
      driver.findElement(By.id("txtUsername")).sendKeys("durga123");
 
      driver.findElement(By.id("txtPassword")).sendKeys("Durg@123");
 
 
 
     //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
 
     driver.findElement(By.className("button")).click();
     
     //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
     //id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
     
     By pimlocator=By.id("menu_pim_viewPimModule");
     WebElement pim=driver.findElement(pimlocator);
     Actions action=new Actions(driver);
     
     action.moveToElement(pim).build().perform();
    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
     By addemployeelocator=By.linkText("Add Employee");
     
     WebElement addemployee=driver.findElement(addemployeelocator);
     addemployee.click();
     
     //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
     WebElement welcomeLinkText=driver.findElement(By.linkText("Welcome Admin"));
     
     String welcomeelementtext=welcomeLinkText.getText();
     System.out.println("the actual test of the orangehrm hom is:"+welcomeelementtext);
     welcomeLinkText.click();
     Thread.sleep(5000);
     
    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
     By homepageLogoutProperty=By.linkText("Logout");
     WebElement homePageLogout=driver.findElement(homepageLogoutProperty);
     homePageLogout.click();
     
     
     
 
    
 
     //By HomePageProperty=By.linkText(apllicationurlAddress);
    // WebDriverWait wait=new WebDriverWait(chromeDriver, 10);
  
 
     driver.close();
}
}
