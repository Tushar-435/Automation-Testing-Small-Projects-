package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowndemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.name("fromPort"));
		
		Select drp= new Select(ele);
		
		drp.selectByValue("Mexico City");
		
		Thread.sleep(3000);
		
		WebElement el1= driver.findElement(By.name("toPort"));
		
		Select drp1= new Select(el1);
		
		drp1.selectByValue("Berlin");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[5]/td[1]/input")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputName")).sendKeys("Tushar Singh");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("address")).sendKeys("Bahadurgarh");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("city")).sendKeys("Bahadurgarh");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("state")).sendKeys("Haryana");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("zipCode")).sendKeys("124507");
		
		Thread.sleep(3000);
		
		WebElement ele2 = driver.findElement(By.name("cardType"));
		
		Select drp2 = new Select(ele2);
		
		drp2.selectByValue("amex");
		
		//driver.findElement(By.id("cardType")).click();
		
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("cardType")).sendKeys("1154849");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("626498484");
		
		Thread.sleep(3000);
		 
		driver.findElement(By.id("creditCardMonth")).sendKeys("10");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("creditCardYear")).sendKeys("2024");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("nameOnCard")).sendKeys("Tushar Singh");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("rememberMe")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
