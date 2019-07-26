package Demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandle {

	@Test
	public void window(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
driver.findElement(By.xpath("//button[@id='button1']")).click();
		Set<String>Allwindowhandle= driver.getWindowHandles();
		System.out.println(Allwindowhandle);
		for(String child:Allwindowhandle){
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				String title = driver.getTitle();
				System.out.println("Child wondow title is:"+title);
			}
			
			
		}
		driver.switchTo().window(parent);
		String parenttitle = driver.getTitle();
		System.out.println("Parent window title is:"+parenttitle);
		String parenturl=driver.getCurrentUrl();
		System.out.println(parenturl);
	}
}
