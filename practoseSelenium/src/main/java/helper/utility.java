package helper;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class utility {
	
	
	public static WebDriver startBrowser(String browserName, String applicationURL) {
			WebDriver driver = null;
			
			if (browserName.equalsIgnoreCase("Chrome") || browserName.equalsIgnoreCase("Google Chrome")) {
				driver = new ChromeDriver();
;				
			}
			else if (browserName.equalsIgnoreCase("Safari") || browserName.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
;				
			}
			else if (browserName.equalsIgnoreCase("edge") || browserName.equalsIgnoreCase("ms edge")) {
				driver = new EdgeDriver();
;				
			}
			else {
				System.out.println("sorry we dont support this browser at this time");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get(applicationURL);
			
			return driver;
	}
	
	public static void screenshot(WebDriver driver) {
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("./screenshots/" + System.currentTimeMillis() +".png");
		
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			
			System.out.println("message is : " + e.getMessage());
		}
				
	}

}
