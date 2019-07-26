package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Backgroundcolor {

	@Test
	public void Color(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/ChangeManager-V3.3.0/view/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement signbuttonbackgorund = driver.findElement(By.xpath("//input[@class='btn btn-default btn-block btn-lg']"));
	String rgba = signbuttonbackgorund.getCssValue("background-color");
		System.out.println(rgba);
		String Colour = org.openqa.selenium.support.Color.fromString(rgba).asHex();
		System.out.println(Colour);
		
		
	}
}
