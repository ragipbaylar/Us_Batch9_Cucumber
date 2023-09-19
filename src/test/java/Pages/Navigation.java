package Pages;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation {
    public Navigation() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    private WebElement dashBoardTitle;

    public WebElement getDashBoardTitle() {
        return dashBoardTitle;
    }
}
