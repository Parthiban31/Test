package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googledynamicsearch {
@Test
	public void search(){
		
	System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

WebElement searchtext= driver.findElement(By.name("q"));
searchtext.sendKeys("selenium");
List<WebElement>list = driver.findElements(By.xpath("//ul[@role='listbox']//li[@class='sbct']"));
int list_size=list.size();
System.out.println("Searched Suggestions size is:"+" "+list_size);
for(int i=0;i<=list_size;i++){
	WebElement get_i =list.get(i);
	String text=get_i.getText();
	if(text.contains("selenium tutorial")){
		list.get(i).click();
		String title = driver.getTitle();
		System.out.println(title);
		break;
		
		
	}
}
	}
}
