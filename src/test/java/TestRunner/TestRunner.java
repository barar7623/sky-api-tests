package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
                  features = {"src/test/resources/Features"},
                  glue = {"StepDefinitions"},
                  //tags = {"@GetListOfArticles"},
                  // tags are used to run only group of scenarios or group of features
                  // if no tags are specified it will run all the features
                   plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests
{

}
