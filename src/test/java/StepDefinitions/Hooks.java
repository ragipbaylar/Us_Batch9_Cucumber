package StepDefinitions;

import Utilities.DriverClass;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before // Runs before each scenario
    public void beforeScenario() {
        System.out.println("Scenario is starting");
    }

    @After // Runs after each scenario
    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario has ended");

        if (scenario.isFailed()){
           final byte[] byteImage = ((TakesScreenshot)(DriverClass.getDriver())).getScreenshotAs(OutputType.BYTES);
           scenario.attach(byteImage,"image/png", scenario.getName());

//            LocalDateTime timeOfError = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");
//            TakesScreenshot takesScreenshot = (TakesScreenshot) DriverClass.getDriver();
//            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
//            try {
//                FileUtils.copyFile(file,new File("src/test/java/ScreenShots/screenshot"+timeOfError.format(formatter)+".png"));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
        }
        DriverClass.quitDriver();
    }

//    @BeforeStep // Runs before each step
//    public void beforeStep(){
//        System.out.println("Before step is running");
//    }
//
//
//    @AfterStep // Runs after each step
//    public void afterStep(){
//        System.out.println("After step is running");
//    }
}
