// Keyboard actions using Actions Class

package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyboard {

	public static void main(String[] args) {

		// Initialize ChromeDriver
		// Here we assume that the ChromeDriver path has been set in the System Global variables
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		//Navigate to the demo site
		driver.get("https://demoqa.com/text-box");

		//Create object of the Actions class
		Actions actions = new Actions(driver);


		// Enter the Full Name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr. ABC");

		//Enter the Email
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");


		// Enter the Current Address
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));

		currentAddress.sendKeys("45 Icon Baner, Pune");


		// Select the Current Address using CTRL + A

		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// Copy the Current Address using CTRL + C
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();


		//Press the TAB Key to Switch Focus to Permanent Address or use element locator to switch to that field
		actions.sendKeys(Keys.TAB).build().perform();
		//OR
		driver.findElement(By.id("permanentAddress")).sendKeys("");

		//Paste the Address in the Permanent Address field using CTRL + V
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		//Compare Text of current Address and Permanent Address
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		if (currentAddress.getAttribute("value").equals(permanentAddress.getAttribute("value"))) {
			System.out.println("Test Passed: Addresses match.");
		} else {
			System.out.println("Test Failed: Addresses do not match.");
		}

		driver.close();

	}
}
