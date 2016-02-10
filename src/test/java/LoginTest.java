import base.TestBase;
import helpers.CommonDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by student on 2/9/2016.
 */
public class LoginTest extends TestBase {

    private final String USERNAME = "seleniumtests111@gmail.com";
    private final String PASSWORD = "060788avavav";

    private LoginPage loginPage;
    private HomePage homePage;

    @Override
    @BeforeMethod
    public void setup() {
        super.setup();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void loginTest() {
        loginPage.login(USERNAME, PASSWORD);
        homePage.titleShouldAppear(USERNAME);
    }
}
