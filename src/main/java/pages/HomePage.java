package pages;

import base.PageBase;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.Locators.get;

/**
 * Created by student on 2/9/2016.
 */
public class HomePage extends PageBase {

    private final By LOGOUT_BUTTON = get("HomePage.LogoutButton");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void titleShouldAppear(String title) {
        new WebDriverWait(driver, 30).until(ExpectedConditions.titleContains(title));
    }
}
