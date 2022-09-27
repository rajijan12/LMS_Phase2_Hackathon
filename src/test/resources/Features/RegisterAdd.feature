Feature: Registration Textfield validation

Background:
Given User is on LMS website
When User lands on Registration Page
Then User sees the heading on the form as "Registration Form"

Scenario: User fills the Addressfield
Given User is on the Registration page
When User fills the Address in alphanumeric only 
Then Address will be displayed
