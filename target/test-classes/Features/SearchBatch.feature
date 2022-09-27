Feature: Search Batch
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Search by Batch Name
Given User is on Batch page
When user clicks on search box with "Batch Name" entered in it
Then records of that  "Batch Name" are displayed