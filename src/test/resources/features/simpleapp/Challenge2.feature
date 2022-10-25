@challenge2 @android
Feature: Long press and tap multiple times
  Scenario: Long press on List ke-4 button
    Given user already login
    When user go to list menu
    And user long press on "List ke-4" button for 5 second
    Then pop up message contain "List ke-4" will appear

  Scenario: Tap multiple times on List ke-5 button
    Given user already login
    When user go to list menu
    And user tap on "List ke-5" button for 10 times
    Then pop up message contain "List ke-5" will appear