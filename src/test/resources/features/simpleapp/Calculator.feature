@calculator @android
Feature: Calculator
  @positive
  Scenario: verify addition functionality
    Given user already login
    And user input first number is 17
    And user input second number is 10
    And click equal button
    Then the result is 27

  @positive
  Scenario: Verify subtraction number functionality
    Given user already login
    When user input first number is 17
    And user click on dropdown button
    And user select subtraction sign
    And user input second number is 10
    And click equal button
    Then the result is 7

  @positive
  Scenario: Verify division functionality
    Given user already login
    When user input first number is 81
    And user click on dropdown button
    And user select division sign
    And user input second number is 9
    And click equal button
    Then the result is 9

  @positive
  Scenario: Verify multiplication functionality
    Given user already login
    When user input first number is 81
    And user click on dropdown button
    And user select multiplication sign
    And user input second number is 9
    And click equal button
    Then the result is 729

  @positive
  Scenario: Verify division functionality with value 0
    Given user already login
    When user input first number is 0
    And user click on dropdown button
    And user select division sign
    And user input second number is 0
    And click equal button
    Then the result is "NaN"

  @negative
  Scenario: Verify equal button without input number on all field
    Given user already login
    When user empty first number field
    And user click on dropdown button
    And user select subtraction sign
    And user empty second number field
    And click equal button
    Then the equal button can't be clicked