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

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement feesButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsButton;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement entranceExamsSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsInnerButton;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement statesButton;

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

    public WebElement getFeesButton() {
        return feesButton;
    }

    public WebElement getEntranceExamsButton() {
        return entranceExamsButton;
    }

    public WebElement getEntranceExamsSetup() {
        return entranceExamsSetup;
    }

    public WebElement getEntranceExamsInnerButton() {
        return entranceExamsInnerButton;
    }

    public WebElement getStatesButton() {
        return statesButton;
    }
}
