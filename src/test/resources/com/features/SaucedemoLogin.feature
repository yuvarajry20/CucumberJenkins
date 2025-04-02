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
Feature: Login Feature
  I want to use my feature file for testing saucedemo application

  @chrome
  Scenario: Login feature with valid credentials
    Given I am in the suacedemo website
    Then I provide valid username
    And I provide valid password
    When I click Login
    Then I can see product page

  @firefox
  Scenario: Login feature with Invalid credentials
     Given I am in the suacedemo website
    Then I provide Invalid username
    And I provide valid password
    When I click Login
    Then I can see Error message
    
    @chrome
  Scenario: Login feature with Invalid credentials
     Given I am in the suacedemo website
    Then I provide valid username
    And I provide Invalid password
    When I click Login
    Then I can see Error message
    
    @chrome
  Scenario: Login feature with Invalid credentials
     Given I am in the suacedemo website
     Then I provide no username
    And I provide valid password
    When I click Login
    Then I can see empty username Error message
    
    @firefox
  Scenario: Login feature with Invalid credentials
     Given I am in the suacedemo website
    Then I provide valid username
    And I provide no password
    When I click Login
    Then I can see empty password Error message

 
