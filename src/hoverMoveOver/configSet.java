package hoverMoveOver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class configSet {

    public static void tearup(WebDriver driver){
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }
}
