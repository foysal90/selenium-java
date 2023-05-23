package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class signInIslahiArt extends basicIslahi{
  @Test
  public void login() throws InterruptedException {
	  driver.findElement(By.xpath("(//*[name()='path'])[7]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//li[@class='xoo-el-login-tgr xoo-el-active'][normalize-space()='Login'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("xoo-el-username")).sendKeys("Foysal");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys("123456");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Sign In'])[1]")).click();
	  
	  Thread.sleep(5000);
  }
}
