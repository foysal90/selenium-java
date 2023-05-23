package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import helper.utility;

public class basic {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
	 driver = utility.startBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 utility.screenshot(driver);
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
