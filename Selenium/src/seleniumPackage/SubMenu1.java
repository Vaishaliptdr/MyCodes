//Handling menu and sub menu

package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubMenu1 {
	public static void main(String[] args) throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Actions action=new Actions(driver);
		
		WebElement Category=driver.findElement(By.xpath("//li[@class='nav__item dropdown']"));
		Category.click();
		
		WebElement Software=driver.findElement(By.xpath("//li[text()='Software Testing']"));
		Software.click();
		
		WebElement Selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
		Selenium.click();
		System.out.println("Selenium material Url: "+driver.getCurrentUrl());
		
	}
	
}
