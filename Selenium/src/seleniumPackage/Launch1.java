/*If we want to transfer the code to other device which does not have Chrome driver on it 
 * then we need to install and set the path for that. Without doing that we can get the 
 * current directory path and save the driver in our current project itself */ 

package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {

	public static void main(String[] args) {

		/**********************Chrome Browser*******************************/
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"//Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Initialize a Chrome WebDriver instance
		WebDriver chromeDriver = new ChromeDriver();

		// Launch a website using Chrome
		chromeDriver.get("https://www.google.com");
		//chromeDriver.findElement(By.xpath("//*[@id='APjFqb'][@name='q']")).sendKeys("Hello");
		
		WebElement searchBoxChrome = chromeDriver.findElement(By.name("q"));
		searchBoxChrome.sendKeys("Infobeans");
		
		searchBoxChrome.sendKeys(Keys.ENTER);

		// Print the title of the page in Chrome
		System.out.println("Chrome Page title is: " + chromeDriver.getTitle());

		// Pause for 5 seconds (optional)
		try {
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//chromeDriver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Hello");
		// Close the Chrome browser

		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		chromeDriver.quit();

	}

}
