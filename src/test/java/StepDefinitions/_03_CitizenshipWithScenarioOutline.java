package StepDefinitions;

import Pages.Dialog;
import Pages.Navigation;
import io.cucumber.java.en.And;

public class _03_CitizenshipWithScenarioOutline {
    Navigation navigation = new Navigation();
    Dialog dialog = new Dialog();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        navigation.clickMethod(navigation.getSetUpButton());
        navigation.clickMethod(navigation.getParameters());
        navigation.clickMethod(navigation.getCitizenship());
    }

    @And("Enter {string} and {string}")
    public void enterAnd(String citizenshipName, String citizenshipShortname) {
        dialog.sendKeysMethod(dialog.getFormNameInput(), citizenshipName);
        dialog.sendKeysMethod(dialog.getFormShortnameInput(), citizenshipShortname);
    }

    @And("Search for {string} as citizenship name")
    public void searchForAsCitizenshipName(String citizenshipName) {
        dialog.sendKeysMethod(dialog.getSearchNameInput(),citizenshipName);
        dialog.clickMethod(dialog.getSearchButton());
    }
}
