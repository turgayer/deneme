package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utilities.ConfigurationReader;

public class ContactUsPage extends ParentPage{

    @FindBy(xpath = "//a[text()=' Contact us']")
    public WebElement contactUsBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactUsName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement contactUsEmail;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement contactUsSubject;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement contactUsMessage;


    @FindBy(xpath = "//input[@type='file']")
    public WebElement dateiUpload;

    @FindBy(id = "dropShadowTop")
    public WebElement dropShadowTop;     //alert icin basarisiz bir deneme

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement contactUsSubmit;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement contactUsVerifyText;

    public void fillContactUsMask() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);

        contactUsName.sendKeys(ConfigurationReader.get("userName"));
        contactUsEmail.sendKeys(ConfigurationReader.get("userEmail"));
        contactUsSubject.sendKeys("test");
        contactUsMessage.sendKeys("test von group3");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);
        //dateiUpload.click();
        dateiUpload.sendKeys("C:\\Users\\turgayer\\Desktop\\SaleVali\\ProductsImages\\Mendel2.jpeg");
        contactUsSubmit.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();      //sayfadan bagimsiz cikan webelementler = (alert accept icin)
        // driver.switchTo().alert().dismiss();  //alert cancel icin

        //   action.sendKeys(Keys.RETURN).build().perform();  //alert icin basarisiz bir deneme
        //   js.executeScript("window.confirm = function(){return true;};"); //alert icin basarisiz bir deneme

    }

    public void contactUs(){
        contactUsBtn.click();
    }

    public void verifyContactUsMessage(){
            String expectedText = "Success! Your details have been submitted successfully.";
            String actualText = contactUsVerifyText.getText();
            Assert.assertEquals(expectedText,actualText);
        }
    }

