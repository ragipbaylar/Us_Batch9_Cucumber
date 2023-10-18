package StepDefinitions;

import Pages.Dialog;
import Pages.Navigation;
import Utilities.DBUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _09_StatesDatabaseTestSteps {
    Navigation navigation = new Navigation();
    Dialog dialog = new Dialog();

    @And("Navigate to States page")
    public void navigateToStatesPage() {
        navigation.clickMethod(navigation.getSetUpButton());
        navigation.clickMethod(navigation.getParameters());
        navigation.clickMethod(navigation.getStatesButton());
    }

    List<List<String>> dataFromDatabase;

    @When("Send {string} as query")
    public void sendAsQuery(String query) {
        dataFromDatabase = DBUtilities.getData(query);
    }

    @Then("Check if the results match with the UI")
    public void checkIfTheResultsMatchWithTheUI() {
        List<WebElement> statesListFromUI = dialog.getStatesList();
        for (int i=0; i< statesListFromUI.size(); i++){
            Assert.assertEquals(dataFromDatabase.get(i).get(0),statesListFromUI.get(i).getText());
        }
    }
}
