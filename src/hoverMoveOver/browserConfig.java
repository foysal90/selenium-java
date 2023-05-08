package hoverMoveOver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserConfig {
    public  static  void browserSetUp(WebDriver driver) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/rehanabegom/Desktop/chromedriver");
        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(opt);
        Thread.sleep(1000);
    }
}
