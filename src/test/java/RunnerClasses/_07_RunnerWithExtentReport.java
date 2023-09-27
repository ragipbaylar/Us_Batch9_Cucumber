package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        tags = "@SmokeTest",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _07_RunnerWithExtentReport extends AbstractTestNGCucumberTests {
}
