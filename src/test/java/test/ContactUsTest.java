package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import pages.LoginPage;

public class ContactUsTest extends BasePage{

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @BeforeClass
    public void login(){
        homePage.navigateSignupLogin();
        loginPage.fillLoginMask();
    }
    @Test(priority = 1)
    public void navigateContactUs(){
        contactUsPage.contactUs();
    }

    @Test(priority = 2)
    public void contactMessage() throws InterruptedException {
        contactUsPage.fillContactUsMask();
    }

    @Test(priority = 3)
    public void verifyContactUs(){
        contactUsPage.verifyContactUsMessage();
    }
}
