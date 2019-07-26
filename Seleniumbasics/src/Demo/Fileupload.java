package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload {

	@Test
	public void File() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).click();
		//Thread.sleep(5000);
		Runtime.getRuntime().exec("C://Users//parthiban//Desktop//New folder//auto.exe");
	}
}
