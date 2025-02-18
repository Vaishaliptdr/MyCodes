package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

		public static void main(String[] args) {
			String projectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Static.html");
			driver.manage().window().maximize();
			
			//WebElement on which drag and drop operation needs to be performed 
			WebElement from = driver.findElement(By.id("angular"));
			
			//WebElement to which the above object is dropped
			WebElement to = driver.findElement(By.id("droparea"));
			
			WebElement from1=driver.findElement(By.id("mongo"));
			WebElement from2=driver.findElement(By.id("node"));
			
			//Creating object of Actions class to build composite actions  
			Actions act=new Actions(driver);
			
			//Performing the drag and drop action 
			act.dragAndDrop(from, to).build().perform();
			act.dragAndDrop(from1,to).build().perform();
			act.dragAndDrop(from2, to).build().perform();
			act.dragAndDrop(from2, to).build().perform();
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			driver.quit();
}
}