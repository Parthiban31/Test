package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

	@Test
	public void calender() throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).click();
		List<WebElement>alldates= driver.findElements(By.xpath("//div[@class='datepicker-days']//td"));
		
        for(WebElement selectdate:alldates){
        	String dates = selectdate.getText();
        	System.out.println(dates);
        	if(dates.equalsIgnoreCase("5")){
        		Thread.sleep(5000);
        		selectdate.click();
        	}
        }
		
	}
}
