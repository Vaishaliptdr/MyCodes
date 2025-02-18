package seleniumPackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class NewTabHandling {


	public static void main(String[] args) throws Exception {

		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		// Launching Chrome browser instance.
		WebDriver driver = new ChromeDriver();

		// Manage method to maximize the window.
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Launch application url using get() method.
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);

		//Scrolling the site
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 3000)"); 

		driver.findElement(By.xpath("//*[@id='tabButton']")).click();
		Thread.sleep(3000);

		//Print- How many tabs are opened?
		Set<String> allTabId=driver.getWindowHandles();
		//getWindowHandles gives alphanumeric value so we used set of string type, we can use webElement also.
		System.out.println("All tab id = "+allTabId);
		System.out.println("Total number of tab are = "+allTabId.size());

		Iterator<String> abc= allTabId.iterator();
		String window1=abc.next();
		String window2=abc.next();

		//Print title of Popup window
		driver.switchTo().window(window2);
		System.out.println("Child tab: "+window2);//Print alphanumeric id for popup window
		System.out.println(driver.getTitle());
		System.out.println("Child tab URL: "+driver.getCurrentUrl());

		//Print text of new tab
		System.out.println("Child tab Text: "+driver.findElement(By.id("sampleHeading")).getText()); 
		Thread.sleep(3000);
		driver.close();    //Close current window

		//Print title of Main window
		driver.switchTo().window(window1);
		System.out.println("Main tab: "+window1);//Print alphanumeric id for Main window
		System.out.println("Main tab Title: "+driver.getTitle()); 
		System.out.println("Main tab URL: "+driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.quit();   //Close all associated windows





	}
}
