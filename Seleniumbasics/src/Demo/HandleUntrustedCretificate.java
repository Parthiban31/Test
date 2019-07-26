package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandleUntrustedCretificate {
@Test
	public void Trust(){
		
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(cap);
	}
}
