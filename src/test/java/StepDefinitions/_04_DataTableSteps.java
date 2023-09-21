package StepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class _04_DataTableSteps {
    @Given("Go to the Web Page")
    public void goToTheWebPage() {
        System.out.println("We are on the web page");
    }

    @And("Fill the form with valid data")
    public void fillTheFormWithValidData(DataTable dataTable) { //Gets the entire table from the scenario in Data table format
        // and we can use all data at same step
        List<String> dataList = dataTable.asList(String.class);
//        System.out.println(dataList.get(0));
//        System.out.println(dataList.get(1));
//        System.out.println(dataList.get(2));
//        System.out.println(dataList.get(3));

        for (String data : dataList) {
            System.out.println(data);
        }
    }

    @Then("Save the form")
    public void saveTheForm() {
        System.out.println("The form is saved");
    }

    @And("Enter valid data")
    public void enterValidData(DataTable dataTable) {
//        {{"Name","John"},{"Last Name","Snow"},{"Address","6521 Spring Ave."},{"Phone","6321548965"}}
        List<List<String>> dataList = dataTable.asLists(String.class);
//        System.out.println(dataList.get(0).get(0) + " " + dataList.get(0).get(1));
//        System.out.println(dataList.get(1).get(0) + " " + dataList.get(1).get(1));
//        System.out.println(dataList.get(2).get(0) + " " + dataList.get(2).get(1));
//        System.out.println(dataList.get(3).get(0) + " " + dataList.get(3).get(1));

        for (List<String> row : dataList) {
            System.out.println(row.get(0) + " " + row.get(1));
        }
    }
}
