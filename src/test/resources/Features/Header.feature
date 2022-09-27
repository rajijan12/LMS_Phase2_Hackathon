Feature: Heading

Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Validate the heading
Given user is logged onto LMS web-site
When user is on Program page
Then user should see the heading with text "Manage Program" on the page
