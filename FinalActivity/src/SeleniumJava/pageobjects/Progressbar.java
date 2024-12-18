package SeleniumJava.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Progressbar  {

	
		
		WebDriver driver; 
	
	public Progressbar(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "cricle-btn")
	public
	WebElement clickDownload;

	
	@FindBy(xpath = "(//li[@class='dropdown'])[4]")
	public
	WebElement dropDownProgressBar;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[2]")
	public
	WebElement progressBarDropdown;
}
