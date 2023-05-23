package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class signUpIslahiArt extends basicIslahi {
  @Test
  public void signUp() throws InterruptedException {
	  //driver.findElement(By.xpath("//body/div[@id='page']/header[@id='masthead']/div[@id='ast-desktop-header']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M84.6,62c-')]")).click();
	  
	  driver.findElement(By.xpath("(//*[name()='path'])[7]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//li[text()='Sign Up']")).click();
	  //driver.findElement(By.linkText("Sign")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("abc123@email.com");
	  Thread.sleep(1000);
	
	  
  }
}
