package StepsDefinition;
import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "//src//test//resources//Drivers/chromedriver.exe");

		driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		System.out.println("User successfuly landed on login page: " +driver.getCurrentUrl());
		}

	@When("User enters login and password")
	public void user_enters_login_and_password() {
		driver.findElement(By.id("Email")).sendKeys("hikih76853@modotso.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		System.out.println("User entered username and password");
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("User clicked on Login button");
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Home page is: "+driver.getCurrentUrl());
		System.out.println("User navigated to home page");
	}
}





