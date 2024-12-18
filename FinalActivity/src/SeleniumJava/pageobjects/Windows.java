package SeleniumJava.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Windows {
	WebDriver driver; 
	
	
	public Windows(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Follow Twitter & Facebook']")
	public
	WebElement followButton;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[5]")
	public
	WebElement dropDownWindow;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[3]")
	public
	WebElement WindowDropdown;


	
	
}
