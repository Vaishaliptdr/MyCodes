package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		WebElement Checkbox1=driver.findElement(By.xpath("//input[@value='Automation']"));
		WebElement Checkbox2=driver.findElement(By.xpath("//input[@value='Performance']"));

		if(Checkbox1.isSelected()==false)
		{
			Checkbox1.click();
			System.out.println("Automation value selected");
		}

		Checkbox2.click();
		driver.quit();

	}
}
