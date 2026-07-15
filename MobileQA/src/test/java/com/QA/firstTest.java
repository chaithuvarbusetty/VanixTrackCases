package com.QA;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;



public class firstTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();

       //is it done
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554");

        options.setAppPackage("com.google.android.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        System.out.println("Application Launched");
        Thread.sleep(2000);

        driver.quit();
    }
}
