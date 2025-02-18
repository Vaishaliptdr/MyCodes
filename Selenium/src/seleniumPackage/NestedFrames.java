package seleniumPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Finding number of frames present on web page
		List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
		int size=iframe.size();
		System.out.println("Total number of iframes in webpage are: "+size);

		//Switch to the frame by id
		driver.switchTo().frame("frame1");
		System.out.println("Switched to frame1");

		// Locate the element inside the iframe and get its text
		WebElement text= driver.findElement(By.tagName("body"));
		System.out.println("Frame1 text is: "+text.getText());

		//Finding number of frames present on parent frame
		List<WebElement> iframe1=driver.findElements(By.tagName("iframe"));
		int size1=iframe1.size();
		System.out.println("Total number of iframes in parent frame are: "+size1);

		//Switch to the child frame inside the parent frame by using web element
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		System.out.println("Switched to child frame");

		// Locate the element inside the iframe and get its text
		WebElement text1= driver.findElement(By.tagName("body"));
		System.out.println("Child frame text is: "+text1.getText());

		//Switch back to parent frame
		driver.switchTo().parentFrame();
		
		// Locate the element inside the iframe and get its text
		WebElement text2= driver.findElement(By.tagName("body"));
		System.out.println("Frame text is: "+text2.getText());
		
		// Switch back to the main page content
		driver.switchTo().defaultContent();


		driver.quit();
	}
}
