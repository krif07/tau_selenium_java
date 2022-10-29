package upload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import java.io.File;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        String fileName = "filetoupload.png";
        File file = new File("resources/" + fileName);
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile(file.getAbsolutePath() );
        assertEquals(fileUploadPage.getFileUploadedTitle(), "File Uploaded!");
        assertEquals(fileUploadPage.getFileUploadFileName(), fileName);
    }
}
