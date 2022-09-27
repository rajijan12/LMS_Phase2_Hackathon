Feature: Footer
Background:
Given User is on Login Page
When User clicks Login button after entering valid username and password
Then User should see LMS Home page

Scenario: Validate the text below the table
Given  user clicks on Assignment link
When User is on  Manage Assignment page
Then user should get the text below table 

Scenario: Validate the footer
Given User is logged on to LMS website
When User is on  Manage Assignment page
Then user should get the footer text