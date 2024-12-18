package SeleniumJava.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertandModal {
	
	
	WebDriver driver; 

	public AlertandModal(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='autoclosable-btn-success']")
	public
	WebElement autoCloseBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-autocloseable-success']")
	public
	WebElement autoCloseAlert;
	
	
	@FindBy(xpath = "//button[@id='normal-btn-success']")
	public
	WebElement normalBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-normal-success']")
	public
	WebElement normalAlert;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-normal-success']//button")
	public
	WebElement normalAlertEks;
	
	@FindBy(xpath = "//button[@id='autoclosable-btn-warning']")
	public
	WebElement autocloseWarningBtn;
	
	
	@FindBy(xpath = "//div[@class='alert alert-warning alert-autocloseable-warning']")
	public
	WebElement autocloseWarning;
	
	@FindBy(xpath = "//button[@id='normal-btn-warning']")
	public
	WebElement normalWarningBtn;
	
	
	@FindBy(xpath = "//div[@class='alert alert-warning alert-normal-warning']")
	public
	WebElement normalWarning;
	
	@FindBy(xpath = "//div[@class='alert alert-warning alert-normal-warning']//button")
	public
	WebElement normalWarningEks;
	
	@FindBy(xpath = "	//button[@id='autoclosable-btn-danger']")
	public
	WebElement autoCloseDanger;

	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-autocloseable-danger']")
	public
	WebElement autoCloseDangerT;
	
	@FindBy(xpath = "//button[@id='normal-btn-danger']")
	public
	WebElement normalDangerBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-normal-danger']")
	public
	WebElement normalDangerT;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-normal-danger']//button")
	public
	WebElement normalDangerEks;
	
	
	@FindBy(xpath = "//button[@id='autoclosable-btn-info']")
	public
	WebElement autoCloseInfoBtn;
	
	
	@FindBy(xpath = "//div[@class='alert alert-info alert-autocloseable-info']")
	public
	WebElement autoCloseInfoT;
	
	
	@FindBy(xpath = "//button[@id='normal-btn-info']")
	public
	WebElement normalInfoBtn;
	
	
	@FindBy(xpath = "//div[@class='alert alert-info alert-normal-info']")
	public
	WebElement normalInfoT;
	
	@FindBy(xpath = "//div[@class='alert alert-info alert-normal-info']//button")
	public
	WebElement normalInfoEks;
	
	
	@FindBy(xpath = "(//li[@class='dropdown'])[5]")
	public
	WebElement dropDownAlert;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[1]")
	public
	WebElement AlertDropdown;	
		
	
	
	
	
	
	
	
	
}
