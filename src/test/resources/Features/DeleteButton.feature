Feature: Delete Button
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

 	Scenario: Validating the default state of Delete button
    Given user is logged onto LMS web-site
    When user is on Program page
    Then User should see the Delete button on the top left hand side as Disabled