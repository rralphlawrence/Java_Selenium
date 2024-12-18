package SeleniumJava.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class RadioButton {

	
	WebDriver driver;
	
//	 DriverManagers manage = new DriverManagers(driver);
	 
	 
	public RadioButton(WebDriver driver) {
		// TODO Auto-generated constructor stub
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	@FindBy(css = ".radio-inline> input[value=Female][name='optradio']")
	public
	WebElement radioButtonFemale;
	
	@FindBy(id = "buttoncheck")
	public
	WebElement buttonChecker;

	@FindBy(css = ".radiobutton")
	public
	WebElement radioButtonText;

	@FindBy(css = ".radio-inline> input[value=Female][name='gender']")
	public
	WebElement radioGender;
	
	@FindBy(css = ".radio-inline> input[value='15 - 50'][name='ageGroup']")
	public
	WebElement radioAgegroup;
	
	@FindBy(css = "button[onclick='getValues();']")
	public
	WebElement radioOnclick;

	@FindBy(xpath = "//p[@class='groupradiobutton']")
	public
	WebElement radioMessage;
	

	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	public
	WebElement dropDownRadioButton;
	
	@FindBy(xpath = "(//a[normalize-space()='Radio Buttons Demo'])[1]")
	public
	WebElement radioButtonDropdown;
	
	
	
	
	
}