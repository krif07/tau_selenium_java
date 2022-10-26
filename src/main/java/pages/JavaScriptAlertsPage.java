package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By promptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickAlertButton(){
        driver.findElement(alertButton).click();
    }
    public void clickConfirmButton(){
        driver.findElement(confirmButton).click();
    }
    public void clickPromptButton(){
        driver.findElement(promptButton).click();
    }
    public String getResultText(){
        return driver.findElement(resultText).getText().trim();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void alertClickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alertClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void alertSetTextToPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
