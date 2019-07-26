package Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
@Test
	public void broken() throws IOException{
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	List<WebElement>links = driver.findElements(By.tagName("a"));
	Integer Link_Size=links.size();
	System.out.println("Link size in page is:"+Link_Size);
	for(int i=0;i<Link_Size;i++){
		WebElement ele =links.get(i);
		String url= ele.getAttribute("href");
		verifyLinkActive(url);
	}
	
	}

public static void verifyLinkActive(String linkUrl) throws IOException{
	try {
		URL urls = new URL(linkUrl);
		  HttpURLConnection httpurlconnect =  (HttpURLConnection)urls.openConnection();
		  httpurlconnect.setConnectTimeout(3000);
		  httpurlconnect.connect();
		  if(httpurlconnect.getResponseCode()==200){
			  System.out.println(linkUrl+httpurlconnect.getResponseMessage());
		  }
		 if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
			 System.out.println(linkUrl+httpurlconnect.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
		 }
		  
		  
	} catch (MalformedURLException e) {
		
		e.printStackTrace();
	}
	
}
}
