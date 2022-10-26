package sliider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import static org.testng.Assert.*;

public class SliderTests extends BaseTests {

    @Test
    public void testSlideHorizontallyToNumber(){
        String slideValue = "3.5";
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSliderValue(slideValue);
        assertEquals(horizontalSliderPage.getSliderValue(), slideValue);
    }
}
