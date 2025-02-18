//Handling Dropdown Elements in Selenium

package seleniumPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		Select dropdown1= new Select(driver.findElement(By.id("day")));
		//By Visible Text
		dropdown1.selectByVisibleText("22");
		
		Select dropdown2=new Select(driver.findElement(By.id("month")));
		//By Index
		dropdown2.selectByIndex(2);
		
		//Printing all elements of dropdown
		List <WebElement> op = dropdown2.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
		
		Select dropdown3=new Select(driver.findElement(By.id("year")));
		//By Value
		dropdown3.selectByValue("1991");		
		
		//driver.quit();

	}

}
