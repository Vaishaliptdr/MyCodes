package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SubMenu {
	public static void main(String[] args) throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Actions action=new Actions(driver);
		WebElement Menu=driver.findElement(By.id("nav-hamburger-menu"));
		Menu.click();
		
		WebElement SmartHomes= driver.findElement(By.xpath("//div[text()='Smart Home']"));
		
		// Click "Smart Home" using JavaScript to avoid menu issues
        js.executeScript("arguments[0].click();", SmartHomes);
       Thread.sleep(3000);

		System.out.println(driver.getCurrentUrl());
		
		//Not getting following element as navigated to different url
		WebElement amazonSmartHome = driver.findElement(By.xpath("//a[text()='Amazon Smart Home']"));
		js.executeScript("arguments[0].click();", amazonSmartHome);
		
        amazonSmartHome.click();
}
}
