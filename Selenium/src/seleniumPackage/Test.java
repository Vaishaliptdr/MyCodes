package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com/");
		driver.quit();
		

	}

}
