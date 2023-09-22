package StepDefinitions;

import Pages.Dialog;
import Pages.Navigation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_FeeSteps {
    Dialog dialog = new Dialog();
    Navigation navigation = new Navigation();

    @And("Navigate to Fees Page")
    public void navigateToFeesPage() {
        navigation.clickMethod(navigation.getSetUpButton());
        navigation.clickMethod(navigation.getParameters());
        navigation.clickMethod(navigation.getFeesButton());
    }

    @And("Fill the form")
    public void fillTheForm(DataTable dataTable) {
        List<String> feeInfo = dataTable.asList(String.class);
        dialog.sendKeysMethod(dialog.getFormNameInput(), feeInfo.get(0));
        dialog.sendKeysMethod(dialog.getFormCodeInput(), feeInfo.get(1));
        dialog.sendKeysMethod(dialog.getFeeIntegrationCode(), feeInfo.get(2));
        dialog.getFormFeePriority().clear();
        dialog.sendKeysMethod(dialog.getFormFeePriority(), feeInfo.get(3));
    }

    @When("Click on Save and Exit Button")
    public void clickOnSaveAndExitButton() {
        dialog.getSaveAndExitButton().click();
        dialog.clickMethod(dialog.getSaveAndExitButton());
    }

    @And("Search for the fee name")
    public void searchForTheFeeName(DataTable dataTable) {
        List<String> feeInfo = dataTable.asList(String.class);
        dialog.sendKeysMethod(dialog.getSearchNameInput(), feeInfo.get(0));
        dialog.sendKeysMethod(dialog.getSearchCodeInput(), feeInfo.get(1));
        dialog.sendKeysMethod(dialog.getSearchFeePriority(), feeInfo.get(2));
        dialog.clickMethod(dialog.getSearchButton());
    }
}
