package iFrame;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.IFramePage;

import static org.testng.Assert.*;

public class IFrameTests extends BaseTests {

    @Test
    public void testWriteTextArea(){
        String str1 = "Hola ";
        String str2 = "KrifDL";
        IFramePage iFramePage = homePage.clickIFrame();
        assertEquals(iFramePage.getIFrameTitleText(), "An iFrame containing the TinyMCE WYSIWYG Editor");
        iFramePage.clearTextArea();
        iFramePage.setTextAreaText(str1);
        iFramePage.clickIFrameToolbarIncreaseIndentButton();
        iFramePage.clickIFrameToolbarIncreaseIndentButton();
        System.out.println(iFramePage.getTextAreaStyle());
        iFramePage.setTextAreaText(str2);
        assertEquals(iFramePage.getTextAreaText(), str1 + str2);
        assertEquals(iFramePage.getTextAreaStyle(), "padding-left: 80px;");
    }
}
