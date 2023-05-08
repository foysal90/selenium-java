package autoSuggestHandle;

import helper.utility1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(opt);
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().deleteAllCookies();

        Thread.sleep(1000);

        driver.get("https://google.com");

        Thread.sleep(1000);

//        driver.switchTo().alert().dismiss();
//
//        Thread.sleep(1000);

        driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("mukesh otwani");

        Thread.sleep(2000);


        List<WebElement> allSuggesstions =  driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));

        int count = allSuggesstions.size();
        System.out.println(count);


        for (int i =0;i<count;i++)
        {

            WebElement ele = allSuggesstions.get(i);
            String value = ele.getText();
            System.out.println(value);

            if (value.contains("website")){

                ele.click();
                break;


            }
        }

        //utility1.selectValueFromList(driver,"");
        //ul[@role='listbox']//li[@role='presentation']

    }
}
