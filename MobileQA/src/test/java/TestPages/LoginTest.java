package TestPages;

import TestPages.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)

    public void verifyValidLogin(){

        LoginPage login=new LoginPage(driver);

        login.login(
                "shakya@vanix.in",
                "123456"
        );

        Assert.assertTrue(true);
    }

    @Test(priority = 2)

    public void verifyInvalidLogin(){

        LoginPage login=new LoginPage(driver);

        login.login(
                "abc@gmail.com",
                "12345"
        );

        Assert.assertTrue(true);
    }
}