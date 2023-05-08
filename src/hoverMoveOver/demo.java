package hoverMoveOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

//import static hoverMoveOver.browserConfig.driver;


public class demo {

     static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //browserConfig.browserSetUp(driver);
        //configSet.tearup(driver);

        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--remote-allow-origins=*");

        //it will open Chrome browser
        driver = new ChromeDriver(opt);
        Thread.sleep(1000);

       //IT WILL NAVIGATE TO GOOGLE
        driver.get("http://google.com");
        Thread.sleep(1000);


       // it will maximize window
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //it will delete all cookies
        driver.manage().deleteAllCookies();


        Thread.sleep(1000);

        driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("programming hero");

        Thread.sleep(1000);
        //without using loops
        //driver.findElement(By.xpath("//div[@role='presentation']//b[contains(text(), 'course')]")).click();

        //with using LIST Concept
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
        Thread.sleep(1000);

        int count = list.size();
        System.out.println(count);





      // using forEach loop
        for (WebElement wl :list){
            if (wl.getText().contains("course"))
            {

                String text = wl.getText();
                Thread.sleep(1000);
                System.out.println("Total count : " + count + " , and The Text was Found and clicked : " +  text);
                Thread.sleep(1000);
                wl.click();
                break;
            }
        }


        //using regular for loop

//        for (int i =0;i<count;i++)
//        {
//            WebElement ele = list.get(i);
//            String text = ele.getText();
//            System.out.println(text);
//
//            if (text.contains("course"))
//            {
//                ele.click();
//                break;
//            }
//        }


        Thread.sleep(2000);
      // it will quit thr browser
        driver.quit();




    }
}
