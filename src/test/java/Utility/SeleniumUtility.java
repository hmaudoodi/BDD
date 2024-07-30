package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.BaseSetup;
import org.openqa.selenium.By;


import java.time.Duration;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait() {
        return  new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    private WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //create a method to click in a given locator

    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    public void sentText(By locator, String value) {
       waitForVisibility(locator).sendKeys(value);

    }

    public String getElementText(By locator) {
        return waitForVisibility(locator).getText();

    }


}
