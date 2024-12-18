package SeleniumJava.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class InputForms {

	WebDriver driver;
	
	 
	 
	public InputForms(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

 	
	//Finding Elements for Form demo
	@FindBy(xpath = "//input[@id='user-message']")
	public
	WebElement enterMessage;
	
	@FindBy(className = "btn-primary")
	public
	WebElement showMessage;
	
	@FindBy(name = "sum1")
	public
	WebElement sumInput1;
	
	@FindBy(name = "sum2")
	public
	WebElement sumInput2;
	
	@FindBy(xpath = "(//button[normalize-space()='Get Total'])[1]")
	public
	WebElement getTotal;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	public
	WebElement dropDownForms;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[1]")
	public
	WebElement simpleFormsDropdown;
	
	
	@FindBy(xpath = "(//span[@id='display'])[1]")
	public
	WebElement displayText;
	
	@FindBy(xpath = "//span[@id='displayvalue']")
	public
	WebElement displayValue;
	
	
}
