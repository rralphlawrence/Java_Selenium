package SeleniumJava.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BootstrapModals{
	
	
	WebDriver driver;
	
	public BootstrapModals(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


			@FindBy(xpath = "(//a[@class='btn btn-primary'][normalize-space()='Launch modal'])[1]")
			public
			WebElement modalButton1;
			
			@FindBy(xpath = "//a[@href='#myModal']")
			public
			WebElement modalButton2;
			
			
			@FindBy(xpath = "(//a[@class='btn btn-primary'][normalize-space()='Launch modal'])[3]")
			public
			WebElement lunchModal;
			
			@FindBy(css = "div[id='myModal0'] div[class='modal-body']")
			public
			WebElement modalBody;
			
			
			@FindBy(css = "//div[@id='myModal']//div[@class='modal-body']")
			public
			WebElement modalBodyContent;
			
			@FindBy(xpath = "//div[@id='myModal2']//div[@class='modal-body']")
			public
			WebElement secondModalContent;
			
			//div[@id='myModal2']//div[@class='modal-body']
			
			@FindBy(xpath = "(//a[@class='btn btn-primary'][normalize-space()='Save changes'])[1]")
			public
			WebElement modalSavebutton;
			
			@FindBy(xpath = "(//li[@class='dropdown'])[5]")
			public
			
			WebElement dropDownBootstrap;
			
			@FindBy(xpath = "//li[@class='dropdown open']//li[2]")
			public
			WebElement BootstrapDropdown;
			
			
	
	
	
	
	
}
