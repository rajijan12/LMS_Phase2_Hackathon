Feature: Search Program
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

 	Scenario: Select Program
    Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected
    
    Scenario: Edit Feature
    Given User selects Program using checkbox
    When User clicks on <Edit> button
    Then User is on Program Details form.
    
    Scenario: Edit Program Name
    Given User lands on Program Details form.
    When User edits Name and selects the Save button
    Then User can see updated Name
    
    Scenario: Edit Program Description
    Given User lands on Program Details form.
    When User edits Description and selects the Save button
    Then User can see updated Description
    
    