Feature: AddNewAssignment

Background: 

Given User is on Login Page
When User clicks Login button after entering valid username and password
Then User should see LMS Home page

Scenario: validate add new assignment
Given User is on Assignment page
When User clicks A New Assignment button
Then user can see Assignment details form

Scenario: Enter Assignment Name
Given User is on Assignment page
When user enters Assignment name
Then User can see 'Name' entered

Scenario: Enter Assignment Description
Given User is on Assignment page
When user enters Assignment description
Then User can see 'Description' entered

Scenario: Enter assignment grade
Given User is on Assignment page
When user enters assignment grade
Then user can see 'Grade' entered

Scenario: Enter assignment due date
Given User is on Assignment page
When user enters assignment due date
Then user can see "Assignment due date"
