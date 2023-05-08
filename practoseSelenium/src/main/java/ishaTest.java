import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import helper.utility;

public class ishaTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = utility.startBrowser("Chrome", "https://islahiart.com/");
		
		
		
		WebElement women = driver.findElement(By.linkText("Women’s Clothing"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(women).perform();
		
//        WebElement ele = driver.findElement(By.xpath("//ul[@class='sub-menu']//li[@id='menu-item-2072']//a"));
//		
//		String links = ele.getText();
//		
		
		
		//System.out.println(links);
		
		driver.findElement(By.linkText("T-Shirts")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='https://islahiart.com/shop/womens-comfortable-short-sleeve-tee/']//img[@class='show-on-hover']")).click();
		
		
		driver.findElement(By.xpath("//div[normalize-space()='Heather Navy']")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='L']")).click();
		driver.findElement(By.xpath("//a[@id='plus_qty']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		driver.findElement(By.xpath("//div[@role='alert']//a[@class='button wc-forward wp-element-button'][normalize-space()='View cart']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys("foy21");
		
		//driver.findElement(By.xpath("//button[normalize-space()='Apply coupon']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Checkout']")).click();
		
		driver.findElement(By.name("billing_first_name")).sendKeys("Foysal");
		driver.findElement(By.name("billing_last_name")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//input[@placeholder='House number and street name']")).sendKeys("123 president street");
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("orlando");
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("32836");
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("4074170000");
		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='ship-to-different-address-checkbox']")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@id='place_order']")).click();
		
		//driver.switchTo().alert().dismiss();
		
		
		WebElement state = driver.findElement(By.xpath("//select[@id='billing_state']"));
		
	    System.out.println("List of States : "+state.getText());
		Select s = new Select(state);
		s.selectByVisibleText("Florida");
		
		
		
		
		
		
		
		

	}

}
