package SeleniumJava.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DropDown {
	WebDriver driver;	
	
	
	
	
	public DropDown(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "select-demo")
	public
	WebElement selectDay;
	
	@FindBy(xpath = "//option[@value='New Jersey']")
	public
	WebElement cityOptions;
	
	@FindBy(xpath = "//BUTTON[@value='Print First']")
	public
	WebElement cityButton;
	
	@FindBy(xpath = "//p[@class='selected-value']")
	public
	WebElement selectedValue;
	
	@FindBy(xpath = "//p[@class='getall-selected']")
	public
	WebElement getAllSelected;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	public
	WebElement dropDownSelectDrop;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[4]")
	public
	WebElement selectDropDown;
	
	
}



