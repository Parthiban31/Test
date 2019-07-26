//package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Automationdemo_site {
WebDriver driver=null;
	@Test(priority=1)
	
	public void launch_browser(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	//@Test (priority=2)
	public void Registerform() throws InterruptedException{
		WebElement FirstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FirstName.sendKeys("Suresh");
		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastName.sendKeys("Kumar");
		//Thread.sleep(5000);
		WebElement Address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		//Thread.sleep(5000);
		Address.sendKeys("Tidel park,taramani,chennai-05");
		WebElement EmailAddress = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched']"));
		//Thread.sleep(5000);
		EmailAddress.sendKeys("Suresh.Kumar@gmail.com");
		WebElement PhoneNumber = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']"));
		//Thread.sleep(5000);
		PhoneNumber.sendKeys("9632587410");
		
	}
	//@Test (priority=3)
	public void checkbox(){
	
		List<WebElement>Radiobutton = driver.findElements(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]"));
		int size = Radiobutton.size();
		for(int i=0;i<size;i++){
		String values=	Radiobutton.get(i).getText();
		System.out.println(values);
		if(values.equalsIgnoreCase("Male")){
			Radiobutton.get(i).click();
		Boolean displayButton =	Radiobutton.get(i).isDisplayed();
		System.out.println(displayButton);
		}
		}
		//System.out.println(size);
		//for(WebElement options:Radiobutton){
			//String values_RadioOption = options.getText();
			//System.out.println("The options available in the gender radio button is :"+values_RadioOption);
			//if(values_RadioOption.equalsIgnoreCase("FeMale")){
				//options.click();
			//}
		//}
	}
	
	@Test(priority=4)
	public void Tooltip(){
		WebElement FirstName_Tooltip=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Actions action = new Actions(driver);
		action.moveToElement(FirstName_Tooltip).build().perform();
		String Tooltip_Message = FirstName_Tooltip.getText();
		System.out.println("Tooltip message of first name field is :" +" "+Tooltip_Message);
	}
	
}
