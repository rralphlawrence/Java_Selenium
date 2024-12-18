package SeleniumJava.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class JquerySelect {
	
	
	WebDriver driver;
	
	
	public JquerySelect(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@role='combobox'])[1]")
	public
	WebElement selectCountry;
	
	@FindBy(xpath = "//li[contains(text(),'United States of America')]")
	public
	WebElement clickCountry;
	
	@FindBy(css = "input[placeholder='Select state(s)']")
	public
	WebElement inputState1;
	
	@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
	public
	WebElement clickState1;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	public
	WebElement inputState2;
	
	@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
	public
	WebElement clickState2;
	
	@FindBy(xpath = "//span[@title='American Samoa']")
	public
	WebElement clickTerretories;
	
	@FindBy(xpath = "//span/input[@class='select2-search__field']")
	public
	WebElement selectPuertoRIco;
	
	@FindBy(xpath = "//span/input[@class='select2-search__field']")
	public
	WebElement enterKey;
	
	
	@FindBy(xpath = "//select[@name='files']")
	public
	WebElement progLanguage;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	public
	WebElement dropDownJquery;
	
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[7]")
	public
	WebElement JqueryDropdown;
	
	
	
	@FindBy(xpath = "//span[@class='select2-selection__rendered'][@id='select2-country-container']")
	public
	WebElement countryValue;
	
	
	@FindBy(xpath = "(//li[@title='Alabama'])[1]")
	public
	WebElement Alabama;
	
	@FindBy(xpath = "(//li[@title='Alaska'])[1]")
	public
	WebElement Alaska;
	
	
	@FindBy(xpath = "//span[@title='Puerto Rico']")
	public
	WebElement PuertoRico;
	
	
	
	
}
