package com.vmetry.freecrm.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initializer {
	
	
	
	public static WebDriver driver=null;
	
	public static FileInputStream fis;
	
	public static Properties pro;
	
	public static void openBrowser(String BrowserName) throws Exception
	{
		
		fis = new FileInputStream(new File("D:\\WrokOutSelenium Wrokphase\\FreeCrmBDDProject\\src\\test\\resources\\PropertiesFiles\\Locators.properties"));
		
		pro = new Properties();
		
		pro.load(fis);
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\rivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		if(BrowserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\rivers\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
		}
		
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	 public static WebElement getElement(String XPATH)
	 {
		 return driver.findElement(By.xpath(pro.getProperty(XPATH)));
	 }

}
