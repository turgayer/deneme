package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BasePage {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void signUpLogin(){
        homePage.navigateSignupLogin();
    }

    @Test(priority = 1)
    public void login(){
        loginPage.fillLoginMask();
    }

    @Test(priority = 2)
    public void loginVerify(){
        homePage.verifyLogin();
    }
}
