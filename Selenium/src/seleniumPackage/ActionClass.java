//Actions Class: Context click, double click and mouse hover
package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.potdar\\Desktop\\Softwares\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Scroll down the web page by 3500 pixels  
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 5000)"); 

		Actions act=new Actions(driver);
		Thread.sleep(2000);		

		//Context click
		WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClick).perform();
		String Message=driver.findElement(By.xpath("//*[text()='You have done a right click']")).getText();
		System.out.println(Message);
		driver.navigate().refresh();

		//Double click
		WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleClick).perform();
		String Message1=driver.findElement(By.xpath("//*[text()='You have done a double click']")).getText();
		System.out.println(Message1);
		driver.navigate().refresh();

//		driver.close();

		//Mouse hover
		driver.get("https://www.geeksforgeeks.org/");
		WebElement courses=driver.findElement(By.xpath("//*[text()='Courses']"));
		act.moveToElement(courses).perform();






	}
}
