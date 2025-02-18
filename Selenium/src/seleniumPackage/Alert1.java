/*Alert Handling:
 * 1. Accept
 * 2. Dismiss
 * 3. Getting text
 * 4. Entering text
 * */

package seleniumPackage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class Alert1 {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers/chromedriver.exe");
		
		//Web driver manager
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		//Handling alert boxes with Ok button 
		//Click on generate alert button
		driver.findElement(By.xpath("//*[@class='analystic' and @href='#OKTab']")).click();
		driver.findElement(By.id("OKTab")).click();

		//Using Alert class to first switch to or focus to the alert box  
		Alert ok=driver.switchTo().alert();
		//Get alert text
		System.out.println("Ok alert text is:" +ok.getText());


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Using accept() method to accept the alert box  
		ok.accept();


		//Handling alert boxes with Cancel button
		driver.findElement(By.xpath("//*[@class='analystic' and @href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();

		//Using Alert class to first switch to or focus to the alert box  
		Alert cancel=driver.switchTo().alert();

		//Get alert text
		System.out.println("Cancel alert text is:" +cancel.getText());


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Using dismiss() method to Cancel the alert box 
		cancel.dismiss();

		//Handling alert boxes with enter text
		driver.findElement(By.xpath("//*[@class='analystic' and @href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Alert textbox=driver.switchTo().alert();
		//Entering Text
		textbox.sendKeys("Hello Automation");
		System.out.println("Textbox alert text is:" +textbox.getText());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		textbox.accept();

		driver.quit();
	}
}
