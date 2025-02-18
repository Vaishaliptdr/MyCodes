/*Take the Screenshot of tests and save it in specified folder with specified name */

package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotExample {
    public static void main(String[] args) {
    	String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"//Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to a website
        	driver.get("https://www.google.com/");
        	driver.findElement(By.id("APjFqb")).sendKeys("Selenium Java");
            
            // Take a screenshot and store it as a file
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            
            // Define the destination for the screenshot
            String filePath = projectPath + "\\Screenshot\\Screenshot.png";
            
            // Copy the screenshot to the destination
            FileHandler.copy(screenshot, new File(filePath));
            
            System.out.println("Screenshot saved successfully at: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
