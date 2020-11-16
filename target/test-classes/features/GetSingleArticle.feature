@GetSingleArticle
Feature: Get Single Article

  Scenario Outline: Verify the single article endpoint - Get Method
    Given I want to execute getSingleArticle endpoint
    When I get the single article by '<id>'
    Then I should get 200 success status code for single article
    And I response contains valid article detail

    Examples:
              |id            |
              | 1            |
              | 2            |
              |4656364867443 |
              |5             |
              |3             |





