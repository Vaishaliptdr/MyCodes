//Tooltip by using attribute

package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	public static void main(String[] args) throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		String ExpectedTooltip ="We ask for your age only for statistical purposes.";
		
		WebElement text=driver.findElement(By.id("age"));
		
		//Using getAttribute method
		String ActualTooltip=text.getAttribute("title");
		
		if(ExpectedTooltip.equals(ActualTooltip))
		{
			System.out.println("Test Case Passed");
		}
		else
			System.out.println("Failed");
		driver.switchTo().defaultContent();
}
}
