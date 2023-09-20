package StepDefinitions;

import Pages.Dialog;
import Pages.Navigation;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _02_CountrySteps extends DriverClass {
    Dialog dialog = new Dialog();
    Navigation navigation = new Navigation();

    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        navigation.clickMethod(navigation.getSetUpButton());
        navigation.clickMethod(navigation.getParameters());
        navigation.clickMethod(navigation.getCountries());
    }

    @And("Click on add Button")
    public void clickOnAddButton() {
        dialog.clickMethod(dialog.getAddButton());
    }

    @And("Enter country name and country code")
    public void enterCountryNameAndCountryCode() {
        dialog.sendKeysMethod(dialog.getFormNameInput(), "Batch 9");
        dialog.sendKeysMethod(dialog.getFormCodeInput(), "BT9");
    }

    @When("Click on save button")
    public void clickOnSaveButton() {
        dialog.clickMethod(dialog.getSaveButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dialog.assertSuccessMessage(dialog.getSuccessMessage());
    }

    @And("Search for the name of the country")
    public void searchForTheNameOfTheCountry() {
        dialog.sendKeysMethod(dialog.getSearchNameInput(), "Batch 9");
        dialog.clickMethod(dialog.getSearchButton());
    }

    @And("Click on delete button")
    public void clickOnDeleteButton() {
        dialog.clickMethod(dialog.getDeleteButton());
    }

    @When("Click on delete confirm button")
    public void clickOnDeleteConfirmButton() {
        dialog.clickMethod(dialog.getDeleteConfirmButton());
    }
}
