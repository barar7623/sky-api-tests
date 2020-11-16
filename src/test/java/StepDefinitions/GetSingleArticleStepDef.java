package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import utility.Utility;
import static StepDefinitions.Constants.*;

public class GetSingleArticleStepDef {

    private static ResponseOptions<Response> response;
    private long articleId = 0;


    @Given("^I want to execute getSingleArticle endpoint$")
    public void i_want_to_execute_getSingleArticle_endpoint() throws Throwable {
      RestAssured.baseURI = BASE_URI;
      RestAssured.basePath = BASE_PATH;
    }

    @Then("^I should get (\\d+) success status code for single article$")
    public void i_should_get_success_status_code_for_single_article(int statusCode) throws Throwable {
        Utility.getSingleArticleStatusCode(statusCode);
    }

    @When("^I get the single article by '(.*)'$")
    public void iGetTheSingleArticleById(long id) {
        articleId = id;
        Utility.getSingleArticleById(id);

    }

    @And("^I response contains valid article detail$")
    public void iResponseContainsValidArticleDetail() {
       Utility.verifyArticleResponse(articleId);
    }
}
