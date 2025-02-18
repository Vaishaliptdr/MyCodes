/*Handling radio buttons
 * 1. Is Selected
 * 2. Is Displayed
 * 3. Is Enabled */

package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[text()='Create new account']")).click();

		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
		WebElement customeRadioButton = driver.findElement(By.xpath("//input[@value='-1']"));

		//Checing element is selected or not
		Boolean Button2= maleRadioButton.isSelected();
		if(Button2==false)
			maleRadioButton.click();
		else
			System.out.println("Radio button is already selected");

		//Checking element is displayed or not
		Boolean Button1=femaleRadioButton.isDisplayed();
		if (Button1==true)
			femaleRadioButton.click();

		//Checking element is 
		Boolean Button3=customeRadioButton.isEnabled();
		if(Button3==true)
			customeRadioButton.click();
		driver.quit();
	}
}