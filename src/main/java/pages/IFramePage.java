package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {

    private WebDriver driver;
    private By iFrameTitle = By.cssSelector(".example h3");
    private By iFrameToolbarIncreaseIndentButton = By.cssSelector("button[title='Increase indent']");
    private String iFrameId = "mce_0_ifr";
    private By iFrameTextArea = By.cssSelector("body#tinymce p");

    public IFramePage(WebDriver driver){
        this.driver = driver;
    }
    public String getIFrameTitleText(){
        return driver.findElement(iFrameTitle).getText().trim();
    }
    private void switchToEditArea(){
        driver.switchTo().frame(iFrameId);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public void clickIFrameToolbarIncreaseIndentButton(){
        driver.findElement(iFrameToolbarIncreaseIndentButton).click();
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(iFrameTextArea).clear();
        switchToMainArea();
    }
    public void setTextAreaText(String text){
        switchToEditArea();
        driver.findElement(iFrameTextArea).sendKeys(text);
        switchToMainArea();
    }
    public String getTextAreaText(){
        switchToEditArea();
        String text = driver.findElement(iFrameTextArea).getText();
        switchToMainArea();
        return text;
    }
    public String getTextAreaStyle(){
        switchToEditArea();
        String style = driver.findElement(iFrameTextArea).getAttribute("style");
        switchToMainArea();
        return style;
    }
}
