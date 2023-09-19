package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void beforeScenario(){
        System.out.println("Scenario is starting");
    }

    @After
    public void afterScenario(){
        System.out.println("Scenario has ended");
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("Before step is running");
    }


    @AfterStep
}
