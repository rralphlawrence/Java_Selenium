package SeleniumJava.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InputFormSubmit {
	WebDriver driver;
	
	
	
	public InputFormSubmit(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	 
	 
	@FindBy(xpath = "//input[@name='first_name']")
	public
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='last_name']")
	public
	WebElement lastName;
	
	@FindBy(xpath = "//input[@name='email']")
	public
	WebElement email;
	
	@FindBy(xpath = "//input[@name='phone']")
	public
	WebElement phone;
	
	@FindBy(xpath = "//input[@name='address']")
	public
	WebElement address;
	
	@FindBy(xpath = "//input[@name='city']")
	public
	WebElement city;
	
	@FindBy(xpath = "//select[@name='state']")
	public
	WebElement selectState;
	
	@FindBy(xpath = "//input[@name='zip']")
	public
	WebElement zip;
	
	@FindBy(xpath = "//input[@name='website']")
	public
	WebElement website;
	
	@FindBy(xpath = "//input[@value='yes'][@name='hosting']")
	public
	WebElement hosting;
	
	@FindBy(xpath = "//textarea[@name='comment']")
	public
	WebElement comment;
	
	@FindBy(xpath = "//button[normalize-space()='Send']")
	public
	WebElement btnSubmit;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	public
	WebElement dropDownInputform;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[5]")
	public
	WebElement inputFormDropdown;
	
	
	
	
	
}
