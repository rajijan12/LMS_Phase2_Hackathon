Feature: Add new Batch
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page


Scenario: Validate Add new batch
Given User is on Batch page
When User clicks A New Batch button
Then user can see Batch details form

Scenario: Empty New Batch form submission
Given User is on Batch details page
When User clicks Save button without entering data
Then User gets message 'Name is required'

Scenario: Adding new Batch
Given User is on Batch details page
When User clicks Save button after entering valid data
Then User gets message 'Successful batch created' on Manage Batch page