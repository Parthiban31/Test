package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRM_webtable {
	WebDriver driver;
@Test (priority=1)
	public void BrowserLaunch(){
	System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://ui.freecrm.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	

}
@Test (priority=2)
public void Homepage(){
	WebElement EmailID = driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
	EmailID.sendKeys("parthibang29@gmail.com");
	WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	Password.sendKeys("Parthi@123");
	WebElement Login = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	Login.click();
	String HomePage_Title = driver.getTitle();
	Assert.assertEquals(HomePage_Title, "CRM");
	System.out.println("The application HomePage Title is :"+" "+HomePage_Title);	
}

@Test (priority=3)
public void contact() throws InterruptedException{
	WebElement Contact = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
	Thread.sleep(5000);
	Contact.click();
	String contactPage_Title = driver.getTitle();
	Assert.assertEquals(contactPage_Title, "CRM");
	System.out.println("The application ContactPage Title is :"+" "+contactPage_Title);
}

@Test (priority=4)
public void CRMTable(){
	WebElement Table = driver.findElement(By.xpath("//table[@class='ui celled sortable striped table custom-grid']"));
	List<WebElement>Rows = Table.findElements(By.tagName("tr"));
	int RowSize = Rows.size();
	System.out.println("The Number of Rows Present in the Contact Table is :"+" "+RowSize);
	for(int i=0;i<RowSize;i++){
		List<WebElement>Column = Rows.get(i).findElements(By.tagName("td"));
		int ColumnSize = Column.size();
		System.out.println(ColumnSize);
		for(int j=0;j<ColumnSize;j++){
			String values = Column.get(j).getText();
			System.out.println("Values Present in the contact table is :"+" "+values);
			
		}
	
		
	}
}
}//table[@class='ui celled sortable striped table custom-grid']//tbody
