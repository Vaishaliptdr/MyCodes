package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames1 {
	public static void main(String[] args) {
		// Set up WebDriver and open the target website
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to the page with nested frames
		driver.get("https://demo.automationtesting.in/Frames.html");

		// Switch to the "Iframe with in an Iframe" tab
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		// Switch to the parent iframe
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(parentFrame);
		System.out.println("Switched to Parent Frame");
		
		WebElement ParentText=driver.findElement(By.tagName("Body"));
		System.out.println("Parent frame text is: "+ParentText.getText());

		// Switch to the child iframe within the parent iframe
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(childFrame);
		
		System.out.println("Switched to Child Frame");
		
		WebElement ChildText=driver.findElement(By.tagName("Body"));
		System.out.println("Child frame text is: "+ChildText.getText());

		// Locate the text box inside the child iframe and enter text
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		textBox.sendKeys("Hello, Child Frame!");

		// Switch back to the main page content
		driver.switchTo().defaultContent();

		// Close the driver
		driver.quit();
	}
}
