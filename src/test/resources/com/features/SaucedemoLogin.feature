
Feature: Login Feature
  I want to use my feature file for testing saucedemo application

  @ValidCredentials
  Scenario: Login feature with valid credentials
    Given I am in the suacedemo website
    Then I provide valid username
    And I provide valid password
    When I click Login
    Then I can see product page

  @InvalidCredentials(username)
  Scenario: Login feature with Invalid credentials
     Given I am in the suacedemo website
    Then I provide Invalid username
    And I provide valid password
    When I click Login
    Then I can see Error message
    
    @InvalidCredentials(password)
  Scenario: Login feature with Invalid credentials
     Given I am in the suacedemo website
    Then I provide valid username
    And I provide Invalid password
    When I click Login
    Then I can see Error message
    
    @InvalidCredentials(no-username)
  Scenario: Login feature with Invalid credentials
     Given I am in the suacedemo website
     Then I provide no username
    And I provide valid password
    When I click Login
    Then I can see empty username Error message
    
    @InvalidCredentials(no-password)
  Scenario: Login feature with Invalid credentials
     Given I am in the suacedemo website
    Then I provide valid username
    And I provide no password
    When I click Login
    Then I can see empty password Error message

 
