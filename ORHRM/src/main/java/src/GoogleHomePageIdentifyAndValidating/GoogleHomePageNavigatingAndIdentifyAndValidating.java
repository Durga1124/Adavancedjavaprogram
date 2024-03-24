package GoogleHomePageIdentifyAndValidating;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class GoogleHomePageNavigatingAndIdentifyAndValidating {

	
		public static void main(String[] args) 
		{
    System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
    
	ChromeDriver driver=new ChromeDriver();
	
	String applicationurladderess="http://google.com";
	
	driver.get(applicationurladderess);
	
	String expectedgooglehomepagetitle="Google";
	
	System.out.println("The Expected title of google homepage is: "+expectedgooglehomepagetitle);
	
	String actualgooglehomepagetitle=driver.getTitle();
	
	System.out.println("The Actual Title of googleHomepage is:- "+actualgooglehomepagetitle);

	if(expectedgooglehomepagetitle.equals(actualgooglehomepagetitle))
	{
	System.out.println("the goole home page  title matched  -PASS");



		}
	else
	{
		System.out.println("the goole home page  title NOT matched  -PASS");
	}	
		
		String expectedgooglehomepageUrlAddress="https://www.google.com/";
		
		System.out.println("The Expected  urlAddress of the google homepage is: "+expectedgooglehomepageUrlAddress);
		
		String actualgooglehomepageUrlAddress=driver.getCurrentUrl();
		
		System.out.println("The actual Url of googleHomepage is:- "+actualgooglehomepageUrlAddress);

		if(expectedgooglehomepageUrlAddress.equals(actualgooglehomepageUrlAddress))
		
		{
			
		System.out.println("the goole home page  UrlAddress matched  -PASS");



			}
		else
		{
			System.out.println("the goole home page  UrlAddress NOT matched  -Fail");

		driver.manage().window().maximize();
			
         driver.findElementByLinkText("sign in").click();
		
		}
		driver.close();
		}
		}
		
		
		
		
		

		

