package setIdDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IDRequest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("-remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> WindowId = driver.getWindowHandles();
		
		List<String>windowlist = new ArrayList<String>(WindowId);
		System.out.println("WindowID:-"+ WindowId);
		
		String PWindow = windowlist.get(0);
		
		System.out.println("PWindow:-"+ PWindow);
		
		String CWindow = windowlist.get(1);
		
		System.out.println("CWindow:-"+ CWindow);
		
		Thread.sleep(5000);
		driver.switchTo().window(PWindow);
		
		Thread.sleep(3000);
		driver.switchTo().window(CWindow);
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
