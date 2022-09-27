Feature: Delete Button
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Validating the default state of Delete button 
Given User is on Batch page
When User clicks on the batch link on header
Then Verify that the Delete button next to the search box is Disabled