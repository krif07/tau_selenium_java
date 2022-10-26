package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.KeyPressesPage;


public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResulText(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResulText(), "You entered: p=3.14");
    }
}
