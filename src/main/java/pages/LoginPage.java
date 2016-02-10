package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

import static helpers.Locators.get;

/**
 * Created by student on 2/9/2016.
 */
public class LoginPage extends PageBase {

    private final String TITLE = "Gmail";

    private final By USERNAME_INPUT = get("LoginPage.UsernameInput");
    private final By PASSWORD_INPUT = get("LoginPage.PasswordInput");
    private final By NEXT_BUTTON = get("LoginPage.NextButton");
    private final By LOGIN_BUTTON = get("LoginPage.LoginButton");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(NEXT_BUTTON).click();
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void titleShouldAppear() {
        titleShouldAppear(TITLE);
    }

    public void checkExpectedElements() {
        checkExpectedElements(Arrays.asList(USERNAME_INPUT, PASSWORD_INPUT, NEXT_BUTTON, LOGIN_BUTTON));
    }
}
