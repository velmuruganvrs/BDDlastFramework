Feature: Free CRMAPP Test 
@LoginPage
Scenario: Free CRM Login Page 
	Given Open Browser 
	Then Enter UserName and Password 
		|USERNAME|PASSWORD|
		|velmurugan|9789679298|
	And Click Login Button 
	
	
@CompaniesPage	
Scenario Outline: Test CRMAPP CompaniesPage 

	Given Goto Companies Page 
	Then Enter The CompanyName "<CompaniesName>" 
	Then Enter The AnnualRevenue "<AnnualRevenue>" 
	Then Select The Status "<Status>" 
	Then Enter The PhoneNumber "<PhoneNumber>" 
	And Enter The EmailId "<EmailId>" 
	Then Click Save Button 
	
	Examples: 
		|CompaniesName|AnnualRevenue|Status|PhoneNumber|EmailId|
		|TATA|200000|Active|1111111111|tata@gmail.com|
		|TCS|300000|Hot|2222222222|tcs@gmail.com|
		|VMETRY|400000|New|3333333333|vmetry@gmail.com|
		
		
		
		
		
