package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        assertEquals(loginPage.getTitleField(), "Login Page");

        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLoginButton();
        String flashMessage = securePage.getFlashMessage();

        assertTrue(
                flashMessage.contains("You logged into a secure area!"),
                "Alert test is incorrect");
    }
}
