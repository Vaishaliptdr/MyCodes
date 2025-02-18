/**/
package seleniumPackage;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandling {
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
		//Scrolling the site
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 3000)"); 
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='windowButton']")).click();
		Thread.sleep(3000);

		//Print- How many windows are opened?
		Set<String> allWindowsId=driver.getWindowHandles();
		//getWindowHandles gives alphanumeric value so we used set of string type, we can use webElement also.
		System.out.println("All windows id = "+allWindowsId);
		System.out.println("Total number of windows are = "+allWindowsId.size());

		Iterator<String> abc= allWindowsId.iterator();
		String window1=abc.next();
		String window2=abc.next();

		//Print title of Popup window
		driver.switchTo().window(window2);

		driver.navigate().refresh();
		System.out.println("Refreshed Successfully");

		System.out.println("Refreshed child window URL: " + driver.getCurrentUrl());


		WebElement Text=driver.findElement(By.tagName("body"));
		System.out.println("Child Window Text: "+Text.getText());

		System.out.println("Child window is = "+window2);//Print alphanumeric id for popup window
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		//driver.close();    //Close current window

		//Print title of Main window
		driver.switchTo().window(window1);
		System.out.println("Main window is = "+window1);//Print alphanumeric id for Main window
		System.out.println("Main Window title: "+driver.getTitle());  
		Thread.sleep(3000);
		driver.quit();   //Close all associated windows

	}
}
