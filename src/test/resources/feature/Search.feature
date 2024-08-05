Feature: Searches in Home Page

  Scenario: User can do a search from the home page
    Given a user typing username and password in the login page
    When presses the submit button
    Then results are displayed