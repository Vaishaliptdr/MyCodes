package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"//Drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//	Using Single Slash: Absolute XPath-Not Recommended
		//Syntax is: //html/body/tag1[index]/tag2[index]/.../tagN[index]  
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Absolute XPath");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).clear();


		//	Using Double Slash: Relative XPath
		//Syntax is: findElement(By.xpath("//form/div[1]/div/div[1]/div/div/input[1]"));   
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Relative XPath");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).clear();


		//	Using Single Attribute
		//Syntax is: //<HTML tag>[@attribute_name='attribute_value']  or
		//(//*[@attribute_name='attribute_value'])  
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Single Attribute");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).clear();


		//	Using Multiple Attribute
		//Syntax is://<HTML tag>[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2]  or
		//(//*[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2])  
		driver.findElement(By.xpath("//*[@id='APjFqb'][@name='q']")).sendKeys("Multiple Attribute");
		driver.findElement(By.xpath("//*[@id='APjFqb'][@name='q']")).clear();


		//	Using AND
		//Syntax is: //<HTML tag>[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2]  or
		//(//*[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2])
		driver.findElement(By.xpath("//*[@id='APjFqb' and @name='q']")).sendKeys("Use AND Operator");
		driver.findElement(By.xpath("//*[@id='APjFqb' and @name='q']")).clear();


		//	Using OR
		//Syntax is: //<HTML tag>[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]  or
		//(//*[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2])
		driver.findElement(By.xpath("//*[@id='APjFqb' or @name='q']")).sendKeys("Use OR Operator");
		driver.findElement(By.xpath("//*[@id='APjFqb' or @name='q']")).clear();


		//	Using contains()
		//Syntax is: //<HTML tag>[contains(@attribute_name,'attribute_value')]     or
		//(//*[contains(@attribute_name,'attribute_value')])  
		driver.findElement(By.xpath("//*[contains(@id,'APjFqb')]")).sendKeys("Using Contains");
		driver.findElement(By.xpath("//*[contains(@id,'APjFqb')]")).clear();

		
		//	Using starts_with()
		//Syntax is: //<HTML tag>[starts-with(@attribute_name,'attribute_value')]  or
		//(//*[starts-with(@attribute_name,'attribute_value')])  
		driver.findElement(By.xpath("//*[starts-with(@id,'APjFqb')]")).sendKeys("Using Starts-with method");
		driver.findElement(By.xpath("//*[starts-with(@id,'APjFqb')]")).clear();	
			
		
		//	Using text()
		//Syntax is: //*[text()='TEXT'] 
		driver.findElement(By.xpath("//*[text()='About']")).click();
		driver.navigate().back();


		//	Using last()
		//Syntax is: (//tagName[@type='text'])[last()]
		driver.findElement(By.xpath("(//input[@type='submit'])[last()]")).click();
		driver.navigate().back();



		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();

	}

}
