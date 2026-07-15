package pages;

import core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import locators.LoginLocators;

public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public void clickSignIn() {
        click(LoginLocators.SIGN_IN);
    }

    public void tapEmailField() {
        click(LoginLocators.EMAIL);
    }

    public void enterEmail(String email) {
        type(LoginLocators.EMAIL, email);
    }
    public void tapPasswordField() {
        click(LoginLocators.PASSWORD);
    }

    public void enterPassword(String password) {
        type(LoginLocators.PASSWORD, password);
    }

    public void clickLogin() {
        click(LoginLocators.LOGIN_BUTTON);
    }

    public void login(String email, String password) {

        clickSignIn();

        tapEmailField();

        enterEmail(email);

        tapPasswordField();

        enterPassword(password);

        clickLogin();
    }

    public boolean isLoginSuccessful() {
        return isDisplayed(LoginLocators.LOGIN_SUCCESS);
    }

    public void openCharger() {
        click(LoginLocators.CHARGER);
    }
}