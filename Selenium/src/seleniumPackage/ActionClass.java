package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);		
		WebElement to=driver.findElement(By.id("trash"));
		WebElement from=driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
		act.dragAndDrop(to, from).perform();
		act.dragAndDrop(to, from).build().perform();
		
	}
}
