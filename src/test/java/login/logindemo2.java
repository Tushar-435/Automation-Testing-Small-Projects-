package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logindemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions(); 
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement ele = driver.findElement(By.id("user-name"));
		
		ele.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.id("password"));
		
		ele1.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("checkout")).click();
	   
	   Thread.sleep(3000);
	   
	   WebElement ele2 = driver.findElement(By.id("first-name"));
	   
	   
	   ele2.sendKeys("Tushar");
	    
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("last-name")).sendKeys("Singh");
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("postal-code")).sendKeys("124507");
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("continue")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("finish")).click();
	   
	   Thread.sleep(3000);
	   
	   
		
		String ExpectUrl = ("https://www.saucedemo.com/inventory.html");
		
		String ActualUrl = driver.getCurrentUrl();
		
		if(ExpectUrl.equals(ActualUrl)){
		
		System.out.println("correct");
		}
		
		else {
			System.out.println("incoorect");
		}
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			driver.navigate().forward();
			
			Thread.sleep(3000);
			
			driver.navigate().refresh(); 
			
			Thread.sleep(3000);
			
			driver.close();  
		}
	}


