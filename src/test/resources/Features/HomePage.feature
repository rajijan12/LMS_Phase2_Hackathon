Feature: Test the LMS Homepage Title

Background:

Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: To Verify the title of the Homepage is LMS
Given User is on the browser
When User on HomePage after logging into LMS website
Then verify the title of the page is "LMS"