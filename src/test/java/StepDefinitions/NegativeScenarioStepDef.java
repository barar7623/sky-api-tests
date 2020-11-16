package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Utility;

public class NegativeScenarioStepDef {

    @When("^I submit the POST request with single article$")
    public void iSubmitThePOSTRequestWithSingleArticle() {
        Utility.postSingleArticles();
    }

    @Then("^I should get (\\d+) Page error status code$")
    public void iShouldGetPageErrorStatusCode(int statusCode) {
        Utility.pageNotFoundStatusCode(statusCode);
    }

    @When("^I submit the PUT request with single article$")
    public void iSubmitThePUTRequestWithSingleArticle() {
        Utility.putSingleArticles();
    }

    @When("^I submit the DELETE request with single article$")
    public void iSubmitTheDELETERequestWithSingleArticle() {
        Utility.deleteSingleArticles();
    }

    @Then("^I should get (\\d+) Page not found status code$")
    public void iShouldGetPageNotFoundStatusCode(int arg0) {
        Utility.deleteOpsStatusCode(arg0);
    }
}
