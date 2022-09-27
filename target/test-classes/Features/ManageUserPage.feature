Feature: Manage user page

Background: 
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

 Scenario: Verify landing in Manage user page
 	Given User is on any page after Login
 	When User clicks the Tab "User"
 	Then User should see the Manage user page

