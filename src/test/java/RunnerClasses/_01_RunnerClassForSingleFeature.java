package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/FeatureFiles/_01_Login.feature", // the path of the feature we want to run
        glue = "StepDefinitions" // Where our step definitions are
)
public class _01_RunnerClassForSingleFeature extends AbstractTestNGCucumberTests {
}
