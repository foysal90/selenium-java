package practiseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class alertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = utility.startBrowser("Chrome", "https://www.rediff.com/");
		Thread.sleep(2000);
		
		utility.screenshot(driver);
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		utility.screenshot(driver);
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("proceed")).click();
		
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		

		Thread.sleep(1000);
		driver.findElement(By.name("login")).sendKeys("ahmef2370@gmail.com");
		utility.screenshot(driver);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("foysal@123");
		utility.screenshot(driver);
		Thread.sleep(1000);
		
		driver.findElement(By.name("proceed")).click();
		utility.screenshot(driver);
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	

	}

}
