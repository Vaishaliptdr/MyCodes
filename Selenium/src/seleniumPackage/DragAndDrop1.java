package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop1 {

		public static void main(String[] args) {
			String projectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			driver.manage().window().maximize();
			
			WebElement from = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]"));//not able to locate this element
			//(//div[@class='example-class'])[2]
			WebElement to = driver.findElement(By.id("trash"));
//			WebElement from1=driver.findElement(By.id("mongo"));
//			WebElement from2=driver.findElement(By.id("node"));
			
			
			Actions act=new Actions(driver);
			act.dragAndDrop(from, to).build().perform();
//			act.dragAndDrop(from1,to).build().perform();
//			act.dragAndDrop(from2, to).build().perform();
//			act.dragAndDrop(from2, to).build().perform();
//			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			driver.quit();
}
}
