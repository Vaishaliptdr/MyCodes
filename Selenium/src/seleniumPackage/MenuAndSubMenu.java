//Navigating to sub menu

package seleniumPackage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuAndSubMenu {
	public static void main(String[] args) throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action=new Actions(driver);

		WebElement MainMenu=driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']"));
		action.moveToElement(MainMenu).build().perform();

		WebElement SubMenu=driver.findElement(By.xpath("//a[text()='DevOps']"));
		action.moveToElement(SubMenu).build().perform();
		
		WebElement SubSubMenu=driver.findElement(By.xpath("//a[text()='Kubernetes Certification Training Course: Administrator (CKA)']"));
		SubSubMenu.click();
		System.out.println("Navigated to: "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Current Url: "+driver.getCurrentUrl());
		driver.quit();
	}
}