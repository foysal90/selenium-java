package screenshot;

import library.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class failedTestCase {

    WebDriver driver;
    @Test
    public void failedTestSc(){
        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--remote-allow-origins=*");
        //navigate to chromebrowser
         driver = new ChromeDriver(opt);
        utility.capture(driver, "browser started");
        //navigating to fb url
        driver.get("https://facebook.com");

        //managing browser
        driver.manage().window().maximize();

        driver.findElement(By.id("emails")).sendKeys("abc123@gmail.com");
        String Title = driver.getTitle();
        Assert.assertEquals("hello",Title);
    }

    @AfterMethod
    public void tearDown(ITestResult result){

        if (ITestResult.FAILURE==result.getStatus())
        {
            utility.capture(driver,result.getName());
        }

        driver.quit();

    }
}
