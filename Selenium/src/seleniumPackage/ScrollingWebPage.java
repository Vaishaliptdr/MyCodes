//Scrolling till some point: Not able to click on "Join Now button"

package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {
	public static void main(String[] args) throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Scroll down the web page by 3500 pixels  
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 3000)"); 

		Thread.sleep(5000);

		//Scroll Up the web page by 2000 pixels  
		js.executeScript("scrollBy(0, -2000)"); 

		Thread.sleep(5000);
		
		//Clicking on scroll button
		driver.findElement(By.xpath("//*[@id='scrollButton']")).click();

		driver.quit();

	}
}
