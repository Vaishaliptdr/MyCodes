package seleniumPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
		int size=iframe.size();
		System.out.println("Total number of iframes in webpage are: "+size);

		//Switch to the frame by id
		driver.switchTo().frame("frame1");
		System.out.println("Switched to frame1");
		
		// Locate the element inside the iframe and get its text
		WebElement text= driver.findElement(By.tagName("body"));
		System.out.println("Frame1 text is: "+text.getText());

		// Switch back to the main page content
        driver.switchTo().defaultContent();
    

        //Switch to the frame by Name
		driver.switchTo().frame("frame2");
		System.out.println("Switched to frame2");
		
		WebElement text1= driver.findElement(By.tagName("body"));
		System.out.println("Frame2 text is: "+text1.getText());
		
		driver.quit();
	}
}
