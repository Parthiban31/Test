package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Imagedisplayed {
@Test

public void image(){
	System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");
	driver.manage().window().maximize();
	WebElement imagedisplay = driver.findElement(By.xpath("//img[@class='aligncenter wp-image-2645 size-full']"));
	Boolean image = imagedisplay.isDisplayed();
	System.out.println(image);
}
}
