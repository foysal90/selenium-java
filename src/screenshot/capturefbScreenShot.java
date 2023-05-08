package screenshot;


import library.utility;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import java.io.IOException;

public class capturefbScreenShot {
    @Test
    public  void  captureSc() {

        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--remote-allow-origins=*");
        //navigate to chromebrowser
        WebDriver driver = new ChromeDriver(opt);
        utility.capture(driver, "browser started");
        //navigating to fb url
        driver.get("https://facebook.com");
        utility.capture(driver,"naviagte to fb");
        //managing browser
        driver.manage().window().maximize();
        utility.capture(driver,"max window");
        driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
        utility.capture(driver,"valu was typed");


        driver.quit();



    }


}
