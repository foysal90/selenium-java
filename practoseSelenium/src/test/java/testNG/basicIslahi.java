package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.utility;

public class basicIslahi {
	WebDriver driver;
  @BeforeMethod
  public void openBrowser() {
	  
	  driver = utility.startBrowser("Chrome", "https://islahiart.com/");
	  //utility.screenshot(driver);
	  
  }
  
  @AfterMethod
  public void closeBrowser() {
	  
	  driver.quit();
	  
  }
}
