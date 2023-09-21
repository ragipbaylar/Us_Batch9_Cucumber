package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods {
    public Navigation() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    private WebElement dashBoardTitle;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpButton;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    private WebElement citizenship;

    public WebElement getDashBoardTitle() {
        return dashBoardTitle;
    }

    public WebElement getSetUpButton() {
        return setUpButton;
    }

    public WebElement getParameters() {
        return parameters;
    }

    public WebElement getCountries() {
        return countries;
    }

    public WebElement getCitizenship() {
        return citizenship;
    }
}
