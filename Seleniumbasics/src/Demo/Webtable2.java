package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Webtable2 {

	@Test
	public void table(){

		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fancybox_ns-close"))).click();
		
		
		WebElement Table = driver.findElement(By.name("BookTable"));
		List <WebElement>Rows = Table.findElements(By.tagName("tr"));
		int Row_Size = Rows.size();
		System.out.println("The Number of Rows present  in the table is :"+" "+Row_Size);
		
		for(int i=0;i<Row_Size;i++){
	    List<WebElement>Columns = Rows.get(i).findElements(By.tagName("td"));
	    int Column_Size = Columns.size();
	    //System.out.println("The Number of Columns present  in the table is :"+" "+Column_Size);
	    for(int j=0;j<Column_Size;j++){
	    	String CellValues = Columns.get(j).getText();
	    	System.out.println(CellValues);
	    	
	    
	    	}
	  
	    }
		
		}
	}

