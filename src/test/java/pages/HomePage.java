package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class HomePage extends ParentPage{

    @FindBy(xpath ="(//ul[@class='nav navbar-nav']/li)[4]")
    public WebElement signupLoginBtn;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loginVerifyText;

    public void navigateSignupLogin(){
        signupLoginBtn.click();
    }
    public void verifyLogin(){
        String expectedText = "Logged in as";
        String actualText = loginVerifyText.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

}
