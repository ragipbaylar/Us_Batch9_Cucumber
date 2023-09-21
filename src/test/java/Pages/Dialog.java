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
}
