/*Handling windows, switching to child window, closing child window, switching to parent window*/

package seleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args)  {

		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]")).click();

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parentWindow);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("All window handles:" +allWindows);
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				System.out.println("Switched to new window/tab");
				break;
			}
		}

		WebElement e=driver.findElement(By.xpath("//h1"));
		System.out.println(e.getText());

		driver.close();
		System.out.println("Child window closed");

		driver.switchTo().window(parentWindow);

		System.out.println("Switched to Parent window");

		System.out.println("Parent Window: " +driver.getCurrentUrl());



	}

}
