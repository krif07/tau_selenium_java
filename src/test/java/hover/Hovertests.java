package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Hovertests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1");
        assertEquals(caption.getLinkText(), "View profile");
        assertTrue(caption.getLink().endsWith("/1"), "Link is incorrect");
    }
}
