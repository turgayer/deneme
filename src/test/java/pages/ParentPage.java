package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ParentPage {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    public ParentPage() {
        driver = Driver.get();
        wait=new WebDriverWait(driver,15);
        actions=new Actions(driver);
        PageFactory.initElements(driver,this);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}

/*
    @AfterClass
    public void tearDown(ITestResult result) throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.close();
        Driver.closeDriver();
    }
   */
