package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature"},
        glue = "StepDefinitions",
        dryRun = true // only checks if all steps are defined in StepDefinitions package
        //dryRun = false //default value is false. It runs the scenarios regularly
)
public class _02_RunnerWithMultipleFeatures extends AbstractTestNGCucumberTests {
}
