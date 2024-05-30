#Added this into git
Feature: User verifies the Google Application

  Scenario Outline: To validate the Google Application
    Given user lands to the Google Application and clicks on the Search
    Then user makes an search for text "<SearchText>" in the search bar
    Then user clicks on the Selenium link
    Then user clicks on the Documentation link tab
    Then user selects WebDriver under the Documentation
    Examples:
      | SearchText |
      | Selenium   |