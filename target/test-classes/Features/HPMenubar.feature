Feature: Test the LMS homepage heading in menubar

Background:

Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page

Scenario:To verify the homepage heading
Given User is on the browser
When User lands on LMS Home Page
Then User should see the text "LMS - Learning Management System" on the Homepage

