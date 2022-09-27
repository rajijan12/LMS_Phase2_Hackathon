
Feature: Delete icon

Background: 
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Verify the presence of Delete icon in manage user page
Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the delete icon at the top left corner of the user table

Scenario: Behaviour of Delete icon when rows checked
Given User table is displayed in manage user page
When User checks the rows in user table
Then Delete icon at the top left corner of the user table enabled

