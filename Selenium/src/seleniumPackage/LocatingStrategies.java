package seleniumPackage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class LocatingStrategies {

	public static void main(String[] args) {
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"//Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Chrome Page Title is: " +driver.getTitle());
		
		//Finding Search box using id
		driver.findElement(By.id("APjFqb")).sendKeys("ID");
		driver.findElement(By.id("APjFqb")).clear();
		
		//Finding Search box using Name
		driver.findElement(By.name("q")).sendKeys("Name");
		driver.findElement(By.name("q")).clear();
		
		//Finding Search box using Class Name
		driver.findElement(By.className("gLFyf")).sendKeys("ClassName");
		driver.findElement(By.className("gLFyf")).clear();
		
		//Finding Search box using Tag Name
		driver.findElement(By.tagName("textarea")).sendKeys("TagName");
		driver.findElement(By.tagName("textarea")).clear();
		
		//Finding Search box using Link Text
		driver.findElement(By.linkText("How Search works")).click();
		driver.navigate().back();
		
		
		//Finding Search box using Partial Link Text
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.partialLinkText("How")).click();
		driver.navigate().back();
		
		
		//Finding Search box using CSS Tag and id
		//Syntax is: driver.findElement(By.cssSelector("Tag#Value of id attribute"))  
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("CSS Tag and id");
		driver.findElement(By.cssSelector("textarea#APjFqb")).clear();
		
		
		//Finding Search box using CSS Tag and Class
		//Syntax is: driver.findElement(By.cssSelector("Tag.Value of Class attribute"))  
		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("CSS Tag and Class Name");
		driver.findElement(By.cssSelector("textarea.gLFyf")).clear();
		
		
		//Finding Search box using CSS Tag and Attribute
		//Syntax is: driver.findElement(By.cssSelector("Tag[Attribute=value]")) 
		//Here attribute can be anything like id, name etc
		driver.findElement(By.cssSelector("textarea[id=APjFqb]")).sendKeys("CSS Tag and Attribute");
		driver.findElement(By.cssSelector("textarea[id=APjFqb]")).clear();
		
		
		//Finding Search box using CSS Tag, Class and Attribute
		//Syntax is: driver.findElement(By.cssSelector("tag.class[attribute=value]")) 
		//Here attribute can be anything like id, name etc
		driver.findElement(By.cssSelector("textarea.gLFyf[name=q]")).sendKeys("CSS Tag, Class and Attribute");
		driver.findElement(By.cssSelector("textarea.gLFyf[name=q]")).clear();

		
		//Finding Search box using CSS Sub String Matches
		
		//1. Syntax for Starts with (^) is: driver.findElement(By.cssSelector("Tag[attribute^='prefix of the string']"))
		driver.findElement(By.cssSelector("textarea[id^='APj']")).sendKeys("CSS substring Starts with");
		driver.findElement(By.cssSelector("textarea[id^='APj']")).clear();
		
		//2. Syntax for Ends with ($) is: driver.findElement(By.cssSelector("Tag[attribute$=suffix of the string]"))
		driver.findElement(By.cssSelector("textarea[id$='qb']")).sendKeys("CSS substring Ends with");
		driver.findElement(By.cssSelector("textarea[id$='qb']")).clear();
		
		//3. Syntax for Contains (*) is: driver.findElement(By.cssSelector("Tag[attribute*=sub-string]"))  
		driver.findElement(By.cssSelector("textarea[id*='PjF']")).sendKeys("CSS substring Contains");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Define the destination for the screenshot
        String filePath = projectPath + "\\Screenshot\\Screenshot1.png";
        
        // Copy the screenshot to the destination
        try {
			FileHandler.copy(screenshot, new File(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("textarea[id*='PjF']")).clear();

		
		
		

		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
		

	}

}
