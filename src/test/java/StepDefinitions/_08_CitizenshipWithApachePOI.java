package StepDefinitions;

import Pages.Dialog;
import Utilities.ExcelUtilities;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _08_CitizenshipWithApachePOI {

    Dialog dialog = new Dialog();

    @Then("Create a citizenship by using Apache POI")
    public void createACitizenshipByUsingApachePOI() {
        List<List<String>> citizenshipData = ExcelUtilities.getDataFromExcel("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx", "testCitizen", 2);

        for (int i = 0; i < citizenshipData.size(); i++) {
            dialog.clickMethod(dialog.getAddButton());
            dialog.sendKeysMethod(dialog.getFormNameInput(), citizenshipData.get(i).get(0));
            dialog.sendKeysMethod(dialog.getFormShortnameInput(), citizenshipData.get(i).get(1));
            dialog.clickMethod(dialog.getSaveButton());
            dialog.assertSuccessMessage(dialog.getSuccessMessage());
            dialog.wait.until(ExpectedConditions.invisibilityOf(dialog.getSuccessMessage()));
        }
    }
}
