Feature: Footer
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

 	Scenario: Validate the text below the table
    Given user is logged onto LMS web-site
    When user is on Program page
    Then User should see the text as "Showing x to y of z entries" below the table. x- starting record number on that page.

    Scenario: Validate the footer
    Given user is logged onto LMS web-site
    When user is on Program page
    Then User should see the footer as "In total there are z programs"