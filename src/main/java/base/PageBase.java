package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

/**
 * Created by student on 2/9/2016.
 */
public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void titleShouldAppear(String title) {
        new WebDriverWait(driver, 60).until(ExpectedConditions.titleIs(title));
    }

    protected void checkExpectedElements(List<By> elements) {
        for (By element : elements) {
            Assert.assertTrue(driver.findElement(element).isDisplayed());
        }
    }
}
