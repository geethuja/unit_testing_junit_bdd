Feature: Two numbers addition
  As a user of calculator
  I want to add and result of two numbers addition
  so that i can make sure that result is correct

  Scenario: Check add two numbers
    Given user has one number 5
    And user has second number 10
    When user add number one and second
    Then the result is 15