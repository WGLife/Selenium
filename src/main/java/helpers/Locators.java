package helpers;

import org.openqa.selenium.By;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by student on 2/9/2016.
 */
public class Locators {

    private enum LocatorTypes {
        id, css, xpath
    }

    private static final Properties properties;

    static {
        properties = new Properties();
        InputStream stream = Locators.class.getResourceAsStream("/locators.properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static By get(String key) {
        String value = properties.getProperty(key);
        LocatorTypes locatorType = LocatorTypes.valueOf(value.split("=")[0]);
        switch (locatorType) {
            case id: {
                return By.id(value.split("=")[1]);
            }
            case css: {
                return By.cssSelector(value.split("=")[1]);
            }
            case xpath: {
                return By.xpath(value.split("=")[1]);
            }
        }
        return null;
    }
}
