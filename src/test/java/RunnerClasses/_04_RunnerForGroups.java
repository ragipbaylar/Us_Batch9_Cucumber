package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        tags = "@SmokeTest",
        plugin = "{“pretty”, “html:target/cucumber-pretty”, “json:target/cucumber.json”}"
)
public class _04_RunnerForGroups extends AbstractTestNGCucumberTests {
}
