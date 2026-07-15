package com.QA;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

public class rrealDevice {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");

        options.setAutomationName("UiAutomator2");

        options.setDeviceName("ZD222FK5QG");

        options.setUdid("ZD222FK5QG");

        options.setApp("/Users/chaithu/Downloads/app-debug.apk");

        options.setAutoGrantPermissions(true);

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        Thread.sleep(5000);

// Allow notification permission
        try {
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        } catch (Exception e) {
            System.out.println("Permission popup not displayed");
        }

        Thread.sleep(2000);

    }
}
