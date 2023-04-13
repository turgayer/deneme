package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;

public class LoginPage extends ParentPage{

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement usernameInput;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginBtn;

    @FindBy(xpath ="//a[text()=' Logout']")
    public WebElement logoutBtn;

    public void fillLoginMask() {
        usernameInput.sendKeys(ConfigurationReader.get("userEmail"));
        passwordInput.sendKeys(ConfigurationReader.get("userPassword"));
        loginBtn.click();
    }
    public void logout(){
        logoutBtn.click();
    }

}


