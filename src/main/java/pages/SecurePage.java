package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {

    private WebDriver driver;

    private By flashMessage = By.cssSelector("div#flash");
    private By logOutButton = By.cssSelector("div.example a.button");

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    public String getFlashMessage() {
        return driver.findElement(flashMessage).getText().trim();
    }
}
