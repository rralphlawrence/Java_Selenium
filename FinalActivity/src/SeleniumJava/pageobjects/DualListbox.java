package SeleniumJava.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DualListbox {

	
	WebDriver driver; 
	
	public DualListbox(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//li[normalize-space()='bootstrap-duallist'])[1]")
	public
	WebElement clickData;
	
	@FindBy(xpath = "(//button[@class='btn btn-default btn-sm move-right'])[1]")
	public
	WebElement motoToRight;
	
	@FindBy(xpath = "(//input[@placeholder='search'])[2]")
	public
	WebElement searchData;
	
	@FindBy(xpath = "(//ul[@class='list-group'])[1]")
	public
	List<WebElement> dataElementList;
	
	
	@FindBy(xpath = "(//li[@class='dropdown'])[6]")
	public
	WebElement dropDownDualList;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[1]")
	public
	WebElement DualLisdDropdown;
			
	
	@FindBy(xpath = "//div[@class='well text-right']//ul[@class='list-group']")
	public 
	WebElement Listgroup;
			
		}
	
	
	
	
	

