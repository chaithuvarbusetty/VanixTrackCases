package com.QA;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class evseopen {
    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");

        options.setAutomationName("UiAutomator2");

        options.setDeviceName("emulator-5554");

        // Path to your APK

        options.setApp("/Users/chaithu/Downloads/app-debug.apk");

        AndroidDriver driver = new AndroidDriver(

                new URL("http://127.0.0.1:4723"),

                options

        );

        System.out.println("Application launched successfully!");

        Thread.sleep(5000);

        driver.quit();
}}

