Feature: Search Program
Background:
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

 	Scenario: Validate Search Feature
    Given user is logged onto LMS web-site
    When user is on Program page
    Then Text box used for search has text as 'Search'
    
    Scenario: Search Program By Name
    Given User is on Program page
    When User enters Java into search box.
    Then Entries for Java are shown.
    
    Scenario: Search By Description
    Given User is on Program page
    When User enters <description phrase> into search box.
    Then Entries for <description phrase> are shown.
    
    Scenario: Search Program By Status
    Given User is on Program page
    When User enters <status phrase> into search box.
    Then Entries for <status phrase> are shown.