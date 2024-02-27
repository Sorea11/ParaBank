@Run
Feature: Verify login functionality

  Scenario: Verify login functionality with valid data
    Given user navigate to ui
    When user introduce the pass and login
    And user click the submit button
    Then user is redirect to home page