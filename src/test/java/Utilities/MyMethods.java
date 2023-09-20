package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyMethods {
    WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(10));

    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text){
        waitUntilVisible(element);
        element.sendKeys(text);
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void assertSuccessMessage(WebElement element){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains("success"));
    }
}
