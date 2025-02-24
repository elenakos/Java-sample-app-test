package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;


/**
 * In this example, the app needs to be installed on the device before
 * running the test.
 */
public class SampleTest {
    // All elements on a screen
    String TEXT = "text";
    String BUTTON = "button";
    String WELCOME_TEXT = "Hello World!";
    String UPDATED_TEXT = "Have a nice day!";
    String CHECKBOX = "checkBox";
    String URL = "http://127.0.0.1:4723/";

    AndroidDriver driver = null;

    SampleTest() throws Exception {
        // Sample application
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppPackage("org.example.sample");
        // Appium local server address and port:
        URL url = new URL(URL);
        driver = new AndroidDriver(url, options);
    }
    public void setup() {
    }

    public void teardown() {
        driver.quit();
    }

    @Test
    public void testHelloWorld() throws MalformedURLException {
        WebElement element = this.driver.findElement(AppiumBy.id(TEXT));
        assertEquals(WELCOME_TEXT, element.getText());
    }

    @Test
    public void testCanClickButton() throws MalformedURLException {
        WebElement element = this.driver.findElement(AppiumBy.id(TEXT));
        WebElement button = this.driver.findElement(AppiumBy.id(BUTTON));
        button.click();
        assertEquals(UPDATED_TEXT, element.getText());
    }

    @Test
    public void testVerifyCheckbox() throws MalformedURLException  {
        WebElement checkbox1 = this.driver.findElement(AppiumBy.id(CHECKBOX));
        checkbox1.click();
        String checkboxSelected = checkbox1.getAttribute("checked");
        assertEquals("true", checkboxSelected);
    }
}
