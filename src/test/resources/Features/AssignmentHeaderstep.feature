Feature: Heading
Background: 	
Given User is on Login Page
When User clicks Login button after entering valid username and password
Then User should see LMS Home page
	
Scenario: Validate the heading
Given User is logged to LMS website
When User is on Manage Assignment page
Then User should see heading with text "Manage Assignment" on the page
