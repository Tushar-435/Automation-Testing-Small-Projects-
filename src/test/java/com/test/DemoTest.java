package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	public static void main(String[]args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement ele= driver.findElement(By.id("user-name"));
		
		ele.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		WebElement ele1=driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}
		
}