package TestPages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554");
        options.setApp("/Users/chaithu/Downloads/app-debug.apk");
        options.setAutoGrantPermissions(true);

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}