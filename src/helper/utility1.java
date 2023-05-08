package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class utility1 {

    public static  void selectValueFromList(WebDriver driver,String locator,String elementToSearch)  {

        List <WebElement> allValue = driver.findElements(By.xpath(locator));

        for (WebElement ele : allValue){
            if (ele.getText().contains(elementToSearch)){
                ele.click();
                break;
            }






        }

    }
}
