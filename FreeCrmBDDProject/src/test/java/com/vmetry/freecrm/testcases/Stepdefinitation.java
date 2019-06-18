package com.vmetry.freecrm.testcases;

import java.util.Map;


import org.openqa.selenium.WebElement;

import com.vmetry.freecrm.initializer.DriverFunction;
import com.vmetry.freecrm.initializer.Initializer;
import com.vmetry.freecrm.utils.ScreenShot;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefinitation extends Initializer{
	
	@Before("@CompaniesPage")
	
	public void preContion()
	{
		driver.switchTo().frame("mainpanel");
	}
	
	
	@After("@CompaniesPage")
	public void teardown(Scenario s) throws Exception
	{
		
		if(s.isFailed())
		{
			ScreenShot.getScreenShot(s);
		}
		driver.switchTo().defaultContent();
		Thread.sleep(20000);
	}
	@Given("^Open Browser$")
	public void Open_Browser() throws Exception
	{
		openBrowser("chrome");
		
		DriverFunction.loadURL("URL_NAME");
	}
	@Then("^Enter UserName and Password$")
	public void Enter_UserName_and_Password(DataTable IputValue)
	{
		
	for(Map<String,String> value:IputValue.asMaps(String.class, String.class)){
		
		//getElement("USERNAME_XPATH").clear();
		getElement("USERNAME_XPATH").sendKeys(value.get("USERNAME"));
		
		//getElement("PASSWORD_XPATH").click();
		getElement("PASSWORD_XPATH").sendKeys(value.get("PASSWORD"));
	}

	}
	@And("^Click Login Button$")
	public void Click_Login_Button()
	{
		getElement("LOGIN_BUTTON_XPATH").click();
	}
	
	@Given("^Goto Companies Page$")
	public void Goto_Companies_Page()
	{
		
		WebElement target=getElement("COMPANIES_XPATH");
		WebElement newtarget=getElement("NEW_COMPANIES_XPATH");
		
		DriverFunction.actionFuntion(target, newtarget);
	}
	@Then("^Enter The CompanyName \"(.*)\"$")
	public void Enter_The_CompanyName(String CompanyName)
	{
		getElement("COMPANIES_NAME_XPATH").sendKeys(CompanyName);
	}
	
	@Then("^Enter The AnnualRevenue \"([^\"]*)\"$")
	public void enter_AnnualRevenue(String AnnualRevenue)  {
		getElement("ANNUAL_REVENUE_XPATH").sendKeys(AnnualRevenue);
		
	}

	@Then("^Select The Status \"([^\"]*)\"$")
	public void select_Status(String Status) {
	    
		getElement("SELECT_XAPTH").sendKeys(Status);
	}

	@Then("^Enter The PhoneNumber \"([^\"]*)\"$")
	public void enter_the_PhoneNumber(String PhoneNumber) {
		getElement("PHONE_NUMBER_XPATH").sendKeys(PhoneNumber);
	    
	}

	@Then("^Enter The EmailId \"([^\"]*)\"$")
	public void enter_The_EmailId(String EmailId) {
	    
		getElement("EMAILID_XPATH").sendKeys(EmailId);
	}

	@Then("^Click Save Button$")
	public void click_Save_Button()  {
		getElement("SAVE_BUTTON_XPATH").click();    
	
	}

}
