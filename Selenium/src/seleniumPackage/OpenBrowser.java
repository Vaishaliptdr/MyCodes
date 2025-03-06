package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Session ID: " + ((RemoteWebDriver) driver).getSessionId());
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement Searchbox=driver.findElement(By.id("APjFqb"));
		Searchbox.sendKeys("Selenium");
		Searchbox.sendKeys(Keys.ENTER);
		//driver.quit();

	}

}
