Feature: Search Batch
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Validate that number of records (rows of data in the table) displayed 
Given User is on Batch page
When User clicks on the batch link on header
Then Verify the number of records (rows of data in the table) displayed on the page are 5
