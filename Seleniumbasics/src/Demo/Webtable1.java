package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtable1 {
@Test
	public void table(){
	
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@id='fancybox_ns-close']")).click();
	WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
	List<WebElement>Rows = table.findElements(By.tagName("tr"));
	int size= Rows.size();
	for(int i=0;i<size;i++){
		List<WebElement>Columns =Rows.get(i).findElements(By.tagName("td"));
		int colsize= Columns.size();
		for(int j=0;j<colsize;j++){
			String values=Columns.get(j).getText();
			System.out.println(values);
		}
	}
	
	}
}
