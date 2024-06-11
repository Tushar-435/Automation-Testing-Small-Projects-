package ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static void main(String[] args) throws Exception {
		
		ScreenRecorderUtil.startRecord("main");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement el = driver.findElement(By.id("user-name"));
		
		el.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		WebElement el1 = driver.findElement(By.id("password"));
		
		el1.sendKeys("secret_sauce");
		 
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		
		TakesScreenshot sc = ((TakesScreenshot)driver);
		File Src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("E:\\video\\Screenshot\\login.png");
		FileUtils.copyFile(Src, f2);
		
		Thread.sleep(3000);
		driver.close();
		
		ScreenRecorderUtil.stopRecord();
		
		
	}

}
