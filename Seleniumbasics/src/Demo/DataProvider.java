package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DataProvider {

	@Test(dataProvider="Provider")
	public void Data(String UN,String PWD) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://trackme.pointelsolutions.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PWD);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg btn-block btn-login']")).click();
		String Title = driver.getTitle();
		System.out.println("Homepage Title is :"+" "+Title);
	Assert.assertEquals(Title, "Personal Details | PLR");
		
	}
	@org.testng.annotations.DataProvider
	public Object[][] Provider() {
		
		Object[][] obj = new Object [1][2];
		obj [0][0] ="0603250";
	obj[0][1]="password@123";
		return obj;
	}
		
	
	
}
