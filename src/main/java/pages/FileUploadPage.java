package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By fileUploadInput = By.id("file-upload");
    private By fileUploadButton = By.id("file-submit");
    private By fileUploadedTitle = By.cssSelector("div.example h3");
    private By fileUploadFileName = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(fileUploadButton).click();
    }

    public String getFileUploadedTitle() {
        return driver.findElement(fileUploadedTitle).getText().trim();
    }

    public String getFileUploadFileName(){
        return driver.findElement(fileUploadFileName).getText().trim();
    }

    /**
     * Provides path of file to the form then click Upload button
     * @param absoluteFilePath The complete path of the file to upload
     */
    public void uploadFile(String absoluteFilePath){
        driver.findElement(fileUploadInput).sendKeys(absoluteFilePath);
        clickUploadButton();
    }

}
