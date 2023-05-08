package autoSuggestHandle;

import helper.utility1;
import helper.utility2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo2 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(opt);

        Thread.sleep(1000);

        driver.get("https://google.com");

        Thread.sleep(1000);

        utility2.managew(driver);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("mukesh otwani");

        Thread.sleep(2000);

        utility1.selectValueFromList(driver, "//ul[@role='listbox']//li[@role='presentation']", "website");

        Thread.sleep(2000);


        driver.quit();





    }
}
