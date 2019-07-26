package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Imagesize {

	@Test
	public void image(){
		
			System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8080/ChangeManager-V3.3.0/view/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			WebElement imagesize = driver.findElement(By.xpath("//legend[contains(text(),'Change Manager')]//img"));
			Dimension size =imagesize.getSize();
			Rectangle width = imagesize.getRect();
			System.out.println(size);
			System.out.println(width);
			
	}
}
