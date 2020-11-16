package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utility.Utility;
import static StepDefinitions.Constants.BASE_PATH;
import static StepDefinitions.Constants.BASE_URI;


public class GetListOfArticlesStepDef {
    private Response response;

    @Given("^I want to execute getListOfArticles endpoint$")
    public void i_want_to_execute_getListOfArticles_endpoint() throws Throwable {
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = BASE_PATH;
    }
    @When("^I submit the GET request to get list of articles$")
    public void i_submit_the_GET_request_to_get_list_of_articles() throws Throwable {
        Utility.getListOfArticles();
    }

    @Then("^I should get (\\d+) success status code for list of articles$")
    public void iShouldGetSuccessStatusCodeForListOfArticles(int statusCode) {
        Utility.getListOfArticlesStatusCode(statusCode);
    }

    @And("^I response contains valid articles detail$")
    public void iResponseContainsValidArticlesDetail() {
         Utility.verifyListOfArticlesResponse();

    }
}
