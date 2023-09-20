package StepDefinitions;

import Utilities.DriverClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before // Runs before each scenario
    public void beforeScenario(){
        //System.out.println("Scenario is starting");
    }

    @After // Runs after each scenario
    public void afterScenario(){
        //System.out.println("Scenario has ended");
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
