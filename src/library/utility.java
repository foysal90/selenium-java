package library;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class utility

{

    public static  void capture(WebDriver driver, String ScreenshotName)  {

        try {
            TakesScreenshot ts = (TakesScreenshot)driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File desFile = new File("/Users/rehanabegom/Desktop/printable/"+ScreenshotName+".png");
            FileUtils.copyFile(source,desFile );
            System.out.println("screenshot taken");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshots" +e.getMessage());
        }

    }




}
