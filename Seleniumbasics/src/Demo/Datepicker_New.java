package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Datepicker_New {

	
	@Test
	public void Picker(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		List<WebElement>date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	
		for(WebElement select_date:date){
			String dates = select_date.getText();
			System.out.println(dates);
			if(dates.equalsIgnoreCase("31")){
				select_date.click();
				break;
			}
		}
	
		
		
	}
}
