package StepDefinitions;

import Pages.Dialog;
import Pages.Navigation;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        dialog.waitForNumberOfElements(By.xpath("//button[@color='warn']"),1);
        dialog.clickMethod(dialog.getDeleteButton());
    }

    @When("Click on delete confirm button")
    public void clickOnDeleteConfirmButton() {
        dialog.clickMethod(dialog.getDeleteConfirmButton());
    }

    @And("Enter {string} as country name and {string} as country code")
    public void enterAsCountryNameAndAsCountryCode(String countryName, String countryCode) {
        dialog.sendKeysMethod(dialog.getFormNameInput(),countryName);
        dialog.sendKeysMethod(dialog.getFormCodeInput(),countryCode);
    }

    @And("Search for {string} as country name")
    public void searchForAsCountryName(String countryName) {
        dialog.sendKeysMethod(dialog.getSearchNameInput(),countryName);
        dialog.clickMethod(dialog.getSearchButton());
    }
}
