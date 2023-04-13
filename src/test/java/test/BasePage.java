package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import pages.ParentPage;
import utilities.ConfigurationReader;

public class BasePage extends ParentPage {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void navigateUrl() {   //precondition: login and contactUs from BasePage
        driver.get(ConfigurationReader.get("url"));
    }

    @AfterClass
    public void tearDown(){
        loginPage.logout();
        driver.close();
        //driver.quit();
    }
}

