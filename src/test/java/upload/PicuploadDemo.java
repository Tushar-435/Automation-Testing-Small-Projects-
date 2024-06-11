package upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PicuploadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		/*ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);   */
		
		ChromeOptions option = new ChromeOptions(); 
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\tusha\\Downloads\\IMG_20200131_135616_096.jpg");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("file-submit")).click();
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
