Feature: Add new User button 

Background: 
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Verify the presence of Add new user button
Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the button with text "+ Add New User"


