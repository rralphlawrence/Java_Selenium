package SeleniumJava.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckBox {


	WebDriver driver;
	
	public CheckBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	public
	WebElement dropDownCheckbox;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[2]")
	public
	WebElement checkBoxDropdown;
	
	@FindBy(id = "isAgeSelected")
	public
	WebElement clickCheckBox1;
	
	@FindBy(id = "txtAge")
	public
	WebElement checkboxLabel;
	
	@FindBy(id = "check1")
	public
	WebElement buttonCheckAll;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[7]")
	public
	WebElement lastCheckBox;
	
	
	
	
}



