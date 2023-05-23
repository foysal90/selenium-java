package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.utility;

public class loginTest extends basic{
	
  @Test
  public void loginTest() throws Exception {
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  utility.screenshot(driver);
      Thread.sleep(1000);

      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
      utility.screenshot(driver);
      Thread.sleep(1000);
      //driver.findElement(By.xpath("//button[@type='submit']")).click();
      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
      
      utility.screenshot(driver);

	  
	 
  }
  
     
		      

			 
  }

