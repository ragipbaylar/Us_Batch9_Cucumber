package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dialog extends MyMethods {
    public Dialog() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement username;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//span[normalize-space()='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//ms-add-button[@class=\"ng-star-inserted\"]")
    private WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder=\"Name\"])[2]")
    private WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//input[@data-placeholder=\"Name\"]")
    private WebElement searchNameInput;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@color='warn']")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[normalize-space()='Delete']")
    private WebElement deleteConfirmButton;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement formShortnameInput;

    @FindBy(css = "input[data-placeholder='Integration Code']")
    private WebElement feeIntegrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    private WebElement formFeePriority;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted'])[2]")
    private WebElement saveAndExitButton;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    private WebElement searchCodeInput;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[1]")
    private WebElement searchFeePriority;

    @FindBy(css = "mat-select[formcontrolname='academicPeriod']")
    private WebElement academicPeriodDropDown;

    @FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[2]")
    private WebElement academicPeriodOption;

    @FindBy(css = "mat-select[formcontrolname='id']")
    private WebElement gradeLevelDropDown;

    @FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[4]")
    private WebElement gradeLevelOption;

    @FindBy(xpath = "//span[text()='Description']")
    private WebElement description;

    @FindBy(xpath = "//span[text()='Notes']")
    private WebElement notes;

    @FindBy(css = "iframe[class='tox-edit-area__iframe']")
    private WebElement descriptionAndNotesIframe;

    @FindBy(css = "body[id='tinymce']>p")
    private WebElement descriptionAndNoteInput;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getFormNameInput() {
        return formNameInput;
    }

    public WebElement getFormCodeInput() {
        return formCodeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getSearchNameInput() {
        return searchNameInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getDeleteConfirmButton() {
        return deleteConfirmButton;
    }

    public WebElement getFormShortnameInput() {
        return formShortnameInput;
    }

    public WebElement getFeeIntegrationCode() {
        return feeIntegrationCode;
    }

    public WebElement getFormFeePriority() {
        return formFeePriority;
    }

    public WebElement getSaveAndExitButton() {
        return saveAndExitButton;
    }

    public WebElement getSearchCodeInput() {
        return searchCodeInput;
    }

    public WebElement getSearchFeePriority() {
        return searchFeePriority;
    }

    public WebElement getAcademicPeriodDropDown() {
        return academicPeriodDropDown;
    }

    public WebElement getAcademicPeriodOption() {
        return academicPeriodOption;
    }

    public WebElement getGradeLevelDropDown() {
        return gradeLevelDropDown;
    }

    public WebElement getGradeLevelOption() {
        return gradeLevelOption;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getNotes() {
        return notes;
    }

    public WebElement getDescriptionAndNotesIframe() {
        return descriptionAndNotesIframe;
    }

    public WebElement getDescriptionAndNoteInput() {
        return descriptionAndNoteInput;
    }
}
