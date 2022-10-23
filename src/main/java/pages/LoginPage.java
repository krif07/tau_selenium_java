package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By titleField = By.cssSelector("div.example h2");
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("button.radius");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitleField() {
        return driver.findElement(titleField).getText();
    }

    public void setUserNameField(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPasswordField(String password) {
        driver.findElement(this.passwordField).sendKeys(password);
    }

    public SecurePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecurePage(driver);
    }
}
