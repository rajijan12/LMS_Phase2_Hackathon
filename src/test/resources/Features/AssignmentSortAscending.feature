Feature: Results in Ascending order
Background:
Given User is on Login Page
When User clicks Login button after entering valid username and password
Then User should see LMS Home page

Scenario: Verify that the results are displayed in Ascending order of Assignment name
Given User is on Assignment Page
When User clicks onthe Ascending arrow (down ) near to the Assignment name 
Then User can see the results in Ascending order of Assignment name

Scenario: Verify that the results are displayed in Ascending order of Assignment Description
Given User is on Assignment Page
When User clicks onthe Ascending arrow (down ) near to the Assignment Description 
Then User can see the results in Ascending order of Assignment Description

