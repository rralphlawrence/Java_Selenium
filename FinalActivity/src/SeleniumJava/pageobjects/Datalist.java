package SeleniumJava.pageobjects;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Datalist{

	
	WebDriver driver; 
	
	public Datalist(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='search'][@class='form-control']")
	public
	WebElement dataSearch;
	
	@FindBy(xpath = "(//section[@class='content'])[1]")
	public
	 WebElement  elementsList;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[6]")
	public
	WebElement dropDownDataList;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[3]")
	public
	
	WebElement DataListDropdown;
	
	
	
}