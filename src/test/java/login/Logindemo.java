package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logindemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://blazedemo.com/login");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		WebElement ele=  driver.findElement(By.id("email"));
		
		ele.sendKeys("tushar.sm435@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement ele2 = driver.findElement(By.id("password"));
		
		ele2.sendKeys("tushar@43");
		  
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		
		//WebElement ele3 =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/div/div/label/input"));
		
		
		//ele3.click();
		
		driver.findElement(By.name("remember")).click();
		
		
		
		
		

		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
