@NegativeScenario
Feature: Verify with single Article - POST,PUT,DELETE Method

  Scenario: Verify the single article endpoint - POST Method
    Given I want to execute getSingleArticle endpoint
    When I submit the POST request with single article
    Then I should get 400 Page error status code

  Scenario: Verify the single article endpoint - PUT Method
    Given I want to execute getSingleArticle endpoint
    When I submit the PUT request with single article
    Then I should get 404 Page not found status code

  Scenario: Verify the single article endpoint - DELETE Method
    Given I want to execute getSingleArticle endpoint
    When I submit the DELETE request with single article
    Then I should get 404 Page not found status code

