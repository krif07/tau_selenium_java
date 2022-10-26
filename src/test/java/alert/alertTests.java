package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.*;

public class alertTests extends BaseTests {

    @Test
    public void testJavascriptAcceptAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickAlertButton();
        javaScriptAlertsPage.alertClickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(), "You successfully clicked an alert");
    }

    @Test
    public void testJavascriptCancelConfirm(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickConfirmButton();
        assertEquals(javaScriptAlertsPage.getAlertText(), "I am a JS Confirm");
        javaScriptAlertsPage.alertClickToDismiss();
        assertEquals(javaScriptAlertsPage.getResultText(), "You clicked: Cancel");
    }

    @Test
    public void testSetTextToPrompt(){
        String text = "TAU Rocks";
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickPromptButton();
        javaScriptAlertsPage.alertSetTextToPrompt(text);
        javaScriptAlertsPage.alertClickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(), "You entered: " + text);
    }
}
