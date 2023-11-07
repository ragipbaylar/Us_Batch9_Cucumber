package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        tags = "@FireTest",
        plugin = {"pretty", "html:target/cucumber-pretty", "json:target/cucumber.json"}
)
public class _09_RunnerForRegressionJenkins extends AbstractTestNGCucumberTests {
}
