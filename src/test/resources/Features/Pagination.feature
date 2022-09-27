Feature: Pagination

Background: 
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Verify the presence of pagination
Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the pagination controls below data table

Scenario: Verify the Pagination control with more than 5 rows
Given User is on Manage user page
When Manage user table has more than 5 rows
Then Pagination control should be enabled

