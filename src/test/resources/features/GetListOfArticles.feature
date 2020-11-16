@GetListOfArticles
Feature: Get List of Articles

  Scenario: Verify the single article endpoint - Get Method
    Given I want to execute getListOfArticles endpoint
    When I submit the GET request to get list of articles
    Then I should get 200 success status code for list of articles
    And I response contains valid articles detail

