package com.vmetry.freecrm.initializer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DriverFunction extends Initializer{
	
	
	public static void loadURL(String URLNAME)
	{
		driver.get(pro.getProperty(URLNAME));
	}
	
	
	public static void selectFunction(String SelectValue,WebElement Element)
	{
		
		
		Select s = new Select(Element);
		
		s.selectByVisibleText(SelectValue);
	}

	
	public static void actionFuntion(WebElement target,WebElement newtarget)
	{
		Actions a = new Actions(driver);
		
		a.moveToElement(target).moveToElement(newtarget).click().build().perform();
	}
}
