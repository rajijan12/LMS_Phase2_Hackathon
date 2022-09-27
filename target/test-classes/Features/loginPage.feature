Feature: LoginPage
Scenario: Validating the url
Given User is on browser 
When User opens the LMS Website with url 
Then User should see the Login page.

Scenario: Validating the Login functionality with valid username and password
Given User is on Login Page
When User clicks Login button after entering valid username and password
Then User should see LMS Home page


Scenario: Validating the Login functionality with invalid username field
Given User is on Login Page
When User clicks the Login button after entering invalid username
Then User should receive the message "Invalid username and password Please try again"

Scenario: Validating the Login functionality with invalid password field
Given User is on Login Page
When User clicks the Login button after entering invalid password
Then User should receive the message "Invalid username and password Please try again"






		
	
	
