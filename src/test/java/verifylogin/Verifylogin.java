package verifylogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifylogin {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver(option);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void login() throws InterruptedException {
		
		WebElement ele = driver.findElement(By.id("user-name"));
		
		ele.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		WebElement el1 = driver.findElement(By.id("password"));
		
		el1.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("login-button")).click();
		
		
	}
	
	@AfterTest
	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
