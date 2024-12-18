package SeleniumJava.pageobjects;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TableSorted {

	
	WebDriver driver; 
	 
	 
	 
	public TableSorted(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//select[@name='example_length']")
	public
	WebElement showEntries;
	
	
	@FindBy(xpath = "//input[@type='search']")
	public
	WebElement tableSearch;
	
	@FindBy(xpath = "(//table[@id='example'])[1]")
	public
	 WebElement tableRows;
	
	

	@FindBy(xpath = "(//tr[@class='odd'])[1]")
	public
	WebElement Row;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[3]")
	public
	WebElement dropDownTableSort;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[4]")
	public
	WebElement TableSortDropdown;
	
	
}
