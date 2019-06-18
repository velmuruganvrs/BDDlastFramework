package com.vmetry.freecrm.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.vmetry.freecrm.initializer.Initializer;

import cucumber.api.Scenario;

public class ScreenShot extends Initializer{
	
	
	public static void getScreenShot(Scenario s) throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileInputStream stream = new FileInputStream(src);
		
		s.embed(IOUtils.toByteArray(stream), "image/jpeg");
	}

}
