package SeleniumJava.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AjaxForm {

	WebDriver driver;
//	 DriverManagers manage = new DriverManagers(driver);
	
	public AjaxForm(WebDriver driver) {

		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	public
	WebElement dropDownAjaxform;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[6]")
	public
	WebElement AjaxDropdown;
	
	@FindBy(xpath = "//input[@id='title']")
	public
	WebElement inputTitle;
	
	@FindBy(xpath = "//textarea[@name='description']")
	public
	WebElement description;
	
	@FindBy(xpath = "//input[@id='btn-submit']")
	public
	WebElement submitControl;
	
	@FindBy(xpath = "//div[@id='submit-control']")
	public
	WebElement submitResult;
	
	
	
	
	
	
	
	
}




