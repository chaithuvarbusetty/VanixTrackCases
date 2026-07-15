package com.QA;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class loginTest {

    public static void main(String[] args) throws Exception {

        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554");

        // Path to your APK
        options.setApp("/Users/chaithu/Downloads/app-debug.apk");
        options.setAutoGrantPermissions(true);

        // Create Driver
        // Launch app
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        Thread.sleep(5000);

// Allow notification permission
        try {
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        } catch (Exception e) {
            System.out.println("Permission popup not displayed");
        }

        Thread.sleep(2000);

        driver.findElement(AppiumBy.accessibilityId("Sign in")).click();

        Thread.sleep(2000);

//        System.out.println(driver.getCurrentPackage());
//
//        System.out.println(driver.getPageSource());

        // Click Email field
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("(//android.widget.EditText)[1]")))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//android.widget.EditText)[1]")))
                .sendKeys("shakya@vanix.in");

        wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("(//android.widget.EditText)[2]")))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//android.widget.EditText)[2]")))
                .sendKeys("123456");

        wait.until(ExpectedConditions.elementToBeClickable(
                        AppiumBy.accessibilityId("Sign in")))
                .click();


//        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
//
//                AppiumBy.androidUIAutomator(
//
//                        "new UiSelector().text(\"Invalid Email or Password\")")));
//
//        assert popup.isDisplayed() : "Popup is not displayed";
//
//        System.out.println("Popup displayed successfully.");


        try {

            // Wait for success message

            wait.until(ExpectedConditions.visibilityOfElementLocated(

                    AppiumBy.accessibilityId("Login successful")));

            System.out.println("✅ Login Successful");

        } catch (TimeoutException e) {

            System.out.println("❌ Login Failed");

        }
//        System.out.println(driver.getPageSource());


        WebElement charger = wait.until(

                ExpectedConditions.visibilityOfElementLocated(

                        AppiumBy.androidUIAutomator(

                                "new UiSelector().descriptionContains(\"Vanix 7.4kW\")")));

        charger.click();

        Thread.sleep(2000);






        driver.quit();


    }



}