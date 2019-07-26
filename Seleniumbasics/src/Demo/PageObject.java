package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
WebDriver driver =null;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")WebElement userName;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/input[1]")WebElement userPassword;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/input[1]")WebElement  submitButton;
	
	PageObject (WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(WebElement userPassword) {
		this.userPassword = userPassword;

	}

	public WebElement getsubmitButton() {
		return submitButton;
	}

	public void setsubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	
}
