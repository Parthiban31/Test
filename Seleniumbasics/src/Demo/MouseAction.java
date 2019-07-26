package Demo;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction {
	
	@Test
  public void mouseaction() throws InterruptedException{
	  
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/cucumber/execution-order-hooks/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		Actions action = new Actions (driver);
		WebElement Tutorial = driver.findElement(By.xpath("//nav[contains(@class,'navigation')]//li[contains(@class,'menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-26284 has-children')]"));
		
		
		action.moveToElement(Tutorial).build().perform();
		
		WebElement API_Testing = driver.findElement(By.xpath("//nav[contains(@class,'navigation')]//span[contains(@class,'menu-text')][contains(text(),'API Testing Tools')]"));
		
		action.moveToElement(API_Testing).build().perform();
		
		 driver.findElement(By.xpath("//nav[contains(@class,'navigation')]//span[contains(@class,'menu-text')][contains(text(),'Postman Tutorial')]")).click();
		
		//action.moveToElement(PostMan).
		
  }
	
}
