Feature: Number of records
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

 	Scenario: Validate that number of records (rows of data in the table) displayed
    Given user is logged onto LMS web-site
    When user is on Program page
    Then Verify that number of records (rows of data in the table) displayed on the page are 5