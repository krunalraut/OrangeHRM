package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BaseProject
{
    //method for waiting for element to be clickable
    public void waitUtilElementIsClickable(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //method for element to be visible
    public void waitUntilElementIsVisible(By by,int time)
    {
     WebDriverWait wait = new WebDriverWait(driver,time);
     wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //method for click on web element
    public void clickOnWebElement( By by, int time)
    {
       waitUtilElementIsClickable(by,time);
        driver.findElement(by).click();
    }
    //for getting text from page
    public String getTextFromElement(By by, int time) {
        waitUntilElementIsVisible(by,time);
        return driver.findElement(by).getText();
    }
    //for enter text to textbox
    public void typeText(By by, String text, int time)
    {
        waitUtilElementIsClickable(by,time);
        driver.findElement(by).sendKeys(text);
    }
    //for pring current time
    public static long timestamp() {
        return (System.currentTimeMillis());
    }
}
