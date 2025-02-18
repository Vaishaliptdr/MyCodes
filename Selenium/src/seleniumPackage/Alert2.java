package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to website
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//Scrolling the site
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 3000)"); 
        
        //Clicking the button to open the popup
		driver.findElement(By.id("promtButton")).click();
		
		//Switching to the alert
		Alert PromptAlert=driver.switchTo().alert();
		
		//Get alert text
		System.out.println("Alert text is: "+PromptAlert.getText());
		
		//Enter data to alert box
		PromptAlert.sendKeys("Hello Alert Box");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Accept the alert
		PromptAlert.accept();
		
		driver.quit();
		
		}
}
