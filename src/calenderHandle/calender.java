package calenderHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calender {

    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(opt);

        driver.get("http://seleniumpractise.blogspot.com/2016/08/");

        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.xpath("//a[normalize-space()='10']")).click();
        //driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a")).click();


    }
}
