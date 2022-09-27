Feature: Registration Page LoginButton Verification

Scenario:Validating Login button Visibility on Registration Page
Given User is on LMS website
When User lands on Registration Page
Then User sees a button with text "Log in" on the Form


Scenario:Validating the Login button functionality
Given User is on the Registerationpage
When User selects the Login button
Then User lands on login page