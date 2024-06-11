package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pr1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions Options = new ChromeOptions();
		
		
		Options.addArguments("--remote-allow-origins=* ");
		
		/*
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(Options);
		
		*/
		
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(Options);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
