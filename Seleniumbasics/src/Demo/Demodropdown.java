package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demodropdown {

@Test	
	public void dropdown() throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();
	WebElement drops = driver.findElement(By.xpath("//select[@id='select-demo']"));
	Select select = new Select(drops);
	List<WebElement>options =select.getOptions();
	int size = options.size();
	System.out.println(size);
	
	for(int i =0;i<size;i++){
		String values = options.get(i).getText();
		System.out.println(values);
		if(values.equalsIgnoreCase("monday")){
			Thread.sleep(5000);
			options.get(i).click();
		
			
		}
		if(values.equalsIgnoreCase("tuesday")){
			Thread.sleep(5000);
			options.get(i).click();
		}
	
	}
	
	
	}
}
