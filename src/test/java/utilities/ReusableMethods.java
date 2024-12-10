package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethods {

    private static WebDriverWait getWait(WebDriver driver, int timeoutInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    }

    public static void clickElement(WebElement element){
        getWait(Driver.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void verifyElementText(WebElement element,String expectedText){
        Assert.assertEquals("Text does not match!",expectedText,element.getText().trim());
    }

    public static void verifyElementIsVisible(WebElement element){
        getWait(Driver.getDriver(), 10).until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue("Element is not visible!", element.isDisplayed());
    }
}
