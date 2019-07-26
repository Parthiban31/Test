package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pageobjectmodel {

	
	
	WebDriver driver;



	@Test
	public void startTest() {

		
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.100.192:8080/ChangeManager-V3.2.3/view/Login.html");
		driver.manage().window().maximize();
		PageObject loginPage = new PageObject(driver);

		loginPage.getUserName().sendKeys("jMiller");
		loginPage.getUserPassword().sendKeys("");
		loginPage.getsubmitButton().click();
	}

}
