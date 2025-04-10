#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Dashboard Page
  I want to use my feature file to assert features in dashboard page.
  Background:
    Given I am in the OrangeHRM website
    When I Provide Valid username
    And Provide Valid Password
    When i click on the login
    Then i can see my dashboard page

  @tag1
  Scenario Outline: Assert features
    Then I can verify the "<Options>" in dashBoard page

    Examples: 
      |Options  |
      |Assign Leave |
      |Leave List |
      |Timesheets |
      |Apply Leave |
      |My Leave |
      |My Timesheet |
