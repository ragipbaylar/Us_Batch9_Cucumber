package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyMethods {
    public WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(4));

    public void clickMethod(WebElement element) {
        waitUntilClickable(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text) {
        waitUntilVisible(element);
        element.sendKeys(text);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void assertSuccessMessage(WebElement element) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains("success"));
    }

    public void waitForNumberOfElements(By locator, int number){
        wait.until(ExpectedConditions.numberOfElementsToBe(locator,number));
    }
}
