package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        tags = "@SmokeTest",
        plugin = "html:target/site/cucumber-pretty.html" // Generates a html report
)
public class _06_RunnerWithPlugin extends AbstractTestNGCucumberTests {
}
