package com.vmetry.freecrm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features={"D:\\WrokOutSelenium Wrokphase\\FreeCrmBDDProject\\src\\test\\resources\\FeatureFiles\\FreeCrmTest.feature"},glue={"com.vmetry.freecrm.testcases"},dryRun=false,monochrome=true,strict=true,format={"pretty","html:target/Html_reports/",
		"json:target/Json_Reports/cucumber.json","junit:target/Juni_Reports/cucumber.xml","rerun:target/rerun.txt"},tags={"@LoginPage,@CompaniesPage"})
public class TestRunner {
	
	

}
