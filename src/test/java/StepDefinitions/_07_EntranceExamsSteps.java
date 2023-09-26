package StepDefinitions;

import Pages.Dialog;
import Pages.Navigation;
import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _07_EntranceExamsSteps {
    Navigation navigation = new Navigation();
    Dialog dialog = new Dialog();
    @And("Navigate to Entrance Exams page")
    public void navigateToEntranceExamsPage() {
        navigation.clickMethod(navigation.getEntranceExamsButton());
        navigation.clickMethod(navigation.getEntranceExamsSetup());
        navigation.clickMethod(navigation.getEntranceExamsInnerButton());
    }

    @And("Fill the Create Exam form")
    public void fillTheCreateExamForm(DataTable dataTable) {
      List<String> dataList = dataTable.asList(String.class);
      dialog.waitUntilVisible(dialog.getDescription());
      dialog.sendKeysMethod(dialog.getSearchNameInput(), dataList.get(0));
      dialog.clickMethod(dialog.getAcademicPeriodDropDown());
      dialog.clickMethod(dialog.getAcademicPeriodOption());
      dialog.clickMethod(dialog.getGradeLevelDropDown());
      dialog.clickMethod(dialog.getGradeLevelOption());
    }

    @And("Add a Description")
    public void addADescription(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dialog.clickMethod(dialog.getDescription());
        dialog.waitUntilVisible(dialog.getDescriptionAndNotesIframe());
        DriverClass.getDriver().switchTo().frame(dialog.getDescriptionAndNotesIframe());
        dialog.sendKeysMethod(dialog.getDescriptionAndNoteInput(), dataList.get(0));
        DriverClass.getDriver().switchTo().defaultContent();
    }

    @And("Add a Note")
    public void addANote(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dialog.clickMethod(dialog.getNotes());
        dialog.waitUntilVisible(dialog.getDescriptionAndNotesIframe());
        DriverClass.getDriver().switchTo().frame(dialog.getDescriptionAndNotesIframe());
        dialog.sendKeysMethod(dialog.getDescriptionAndNoteInput(), dataList.get(0));
        DriverClass.getDriver().switchTo().defaultContent();

    }
}
