Feature: Search Batch
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Validate the Manage Batch heading
Given User is on Batch page
When User clicks on the batch link on header
Then User should see a heading with text "Manage Batch" on the page