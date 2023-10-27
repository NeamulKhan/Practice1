package practiceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practiceselenium {

	public static void main(String[] args) {
		
		// 3. for next upcoming version 
		ChromeOptions chromeOptions = new ChromeOptions ();
		chromeOptions.setBrowserVersion("118");
	
		// 1. for same chrome version, also for selenium 3
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium\\chromedriver-win64\\chromedriver.exe");//117.exe
		
	//2. Selenium 4- selenium manager included and no need for System.setProperty...
		
		WebDriver driver =  new ChromeDriver(chromeOptions);//117
		driver.get("https://www.google.com/");

	}

}

