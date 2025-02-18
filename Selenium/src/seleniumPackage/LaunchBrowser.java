

package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		/**********************Chrome Browser*******************************/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Initialize a Chrome WebDriver instance
		WebDriver chromeDriver = new ChromeDriver();

		// Launch a website using Chrome
		chromeDriver.get("https://www.google.com");

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

		// Close the Chrome browser
		chromeDriver.quit();


		/************************************Edge Browser************************************/
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\edgedriver_win64\\msedgedriver.exe");

		// Initialize an Edge WebDriver instance
		WebDriver edgeDriver = new EdgeDriver();

		// Launch a website using Edge
		edgeDriver.get("https://www.google.com");

		WebElement searchBoxEdge = edgeDriver.findElement(By.id("APjFqb"));
		searchBoxEdge.sendKeys("Eternus");
		searchBoxEdge.sendKeys(Keys.ENTER);

		// Print the title of the page in Edge
		System.out.println("Edge Page title is: " + edgeDriver.getTitle());

		// Pause for 5 seconds to allow the website to load
		try {
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the Edge browser
		edgeDriver.quit();

		/**************************************Firefox Browser****************************/
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\geckodriver-v0.34.0-win64\\geckodriver.exe");

		// Initialize a Firefox WebDriver instance
		WebDriver firefoxDriver = new FirefoxDriver();

		// Launch a website using Firefox
		firefoxDriver.get("https://www.google.com");

		WebElement searchBoxFirefox = firefoxDriver.findElement(By.id("APjFqb"));
		searchBoxFirefox.sendKeys("Mango");
		searchBoxFirefox.sendKeys(Keys.ENTER);

		// Print the title of the page in Chrome
		System.out.println("Firefox Page title is: " + firefoxDriver.getTitle());

		// Pause for 5 seconds
		try {
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the Firefox browser
		firefoxDriver.quit();

		//        /******************************Internet Explorer Browser****************************************/
		//        System.setProperty("webdriver.ie.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\IEDriverServer_x64_4.14.0\\IEDriverServer.exe");
		//
		//        // Initialize an IE WebDriver instance
		//        WebDriver ieDriver = new InternetExplorerDriver();
		//
		//        // Launch a website using IE
		//        ieDriver.get("https://www.google.com");
		//
		//        // Pause for 5 seconds
		//        try {
		//            Thread.sleep(1000); 
		//        } catch (InterruptedException e) {
		//            e.printStackTrace();
		//        }
		//
		//        // Close the IE browser
		//        ieDriver.quit();

	}
}