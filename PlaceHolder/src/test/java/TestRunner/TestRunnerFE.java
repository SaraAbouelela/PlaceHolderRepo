package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions(features = {"PlaceHolder/src/test/java/FeatureFile/API"}
                    , glue = {"StepDefinition"}
                    , tags = ("@TestScenario")
, plugin = {
        "pretty","html:test-output/DefaultReport/DefaultReport.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
        )

public class TestRunnerFE extends TestBase
{

}
