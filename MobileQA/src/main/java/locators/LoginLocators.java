package locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LoginLocators {

    public static final By SIGN_IN =
            AppiumBy.accessibilityId("Sign in");

    public static final By EMAIL =
            By.xpath("(//android.widget.EditText)[1]");

    public static final By PASSWORD =
            By.xpath("(//android.widget.EditText)[2]");

    public static final By LOGIN_BUTTON =
            AppiumBy.accessibilityId("Sign in");

    public static final By LOGIN_SUCCESS =
            AppiumBy.accessibilityId("Login successful");

    public static final By CHARGER =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().descriptionContains(\"Vanix 7.4kW\")");
}