package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.utility;

public class logoutTest extends basic {
  @Test
  void logoutTest() throws InterruptedException {
	  

	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  utility.screenshot(driver);
      Thread.sleep(1000);

      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
      utility.screenshot(driver);
      Thread.sleep(1000);
      //driver.findElement(By.xpath("//button[@type='submit']")).click();
      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
      
      List<WebElement> links = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']/li/a"));
      int li = links.size();
      System.out.println("Total list :" + li);
      
      
      for(WebElement ele : links) {
    	  
	      String s = ele.getText();
	      System.out.println(s);
	      
	      if(s.contains("Logout")) {
	    	  ele.click();
	    	  
	    	  
	    	  
	    	  String actualURL = driver.getCurrentUrl();
	    	  System.out.println("CurrentURL :" +actualURL);
	    	  String expectedlURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    	  //Assert.assertEquals(actualURL, expectedlURL,"URL did not match");
	    	  
	    	  if(actualURL.equalsIgnoreCase(expectedlURL)) {
	    		  Assert.assertTrue(true);
	    		  System.out.println("Test Suceessfully completed");
	    	  }
	    	  else {
	    		  Assert.assertTrue(false);
	    		  System.out.println("Something went wrong.....!!!");
	    	  }
	    	
	      }
      }
      }
  }
      
