package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bootstrap_dropdown {
@Test
	public void dropdown() throws Throwable{
	System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	
driver.findElement(By.id("menu1")).click();
Thread.sleep(5000);
List<WebElement>list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
int size=list.size();
System.out.println(size);

for(WebElement ele:list){
	String values = ele.getAttribute("innerHTML");
	
	System.out.println(values);
	
	if(values.contains("HTML")){
		
		ele.click();
		
		System.out.println();
		
	}

	}

}
}