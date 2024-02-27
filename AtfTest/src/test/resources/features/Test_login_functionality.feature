@Run
Feature: Verify login functionality
  Background: adsfafad

  Scenario: Verify login functionality with valid data
    Given user navigate to ui
    When user introduce the pass and login
    And user click the submit button
    Then user is redirect to home page

  Scenario Outline: Verify login functionality with valid data
    Given <user> navigate to ui
    When user introduce the pass and login
    And user click the submit button
    Then user is redirect to home page

    Examples:
      | user |
      | u1   |
      | u2   |