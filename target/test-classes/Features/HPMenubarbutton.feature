Feature: Test the Menubarbuttons visibility

Background:

Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario: Verify the Program button visibility
Given User is on the browser
When User lands on LMS Home Page
Then User should see the button with Text "Program" on the menubar

Scenario: Verify the User button visibility
Given User is on the browser
When User lands on LMS Home Page
Then User should see the button with Text "User" on the menubar

Scenario: Verify the Batch button visibility
Given User is on the browser
When User lands on LMS Home Page
Then User should see the button with Text "Batch" on the menubar


Scenario: Verify the Assignment button visibility
Given User is on the browser
When User lands on LMS Home Page
Then User should see the button with Text "Assignment" on the menubar


Scenario: Verify the Attendance button visibility
Given User is on the browser
When User lands on LMS Home Page
Then User should see the button with Text "Attendance" on the menubar


Scenario: Verify the logout button visibility
Given User is on the browser
When User lands on LMS Home Page
Then User should see the button with Text "Logout" on the menubar







