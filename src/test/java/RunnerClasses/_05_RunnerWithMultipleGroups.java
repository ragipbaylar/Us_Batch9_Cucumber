package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        tags = "@SmokeTest and @FireTest" // @SmokeTest and @FireTest runs only the scenarios with both tags
                                          // @SmokeTest or @FireTest runs the scenarios that has either of these tags
)
public class _05_RunnerWithMultipleGroups extends AbstractTestNGCucumberTests {
}
