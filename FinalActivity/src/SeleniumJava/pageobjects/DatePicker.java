package SeleniumJava.pageobjects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DatePicker  {
	
	WebDriver driver;
		
	public DatePicker(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
			@FindBy(xpath = "//span[@class='input-group-addon']/i")
			public
			WebElement clickIcon;
			
			
			@FindBy(xpath = "(//th[@class='today'])[1]")
			public
			WebElement clickToday;
			
			@FindBy(xpath = "//span[@class='input-group-addon']/i")
			public
			WebElement clickIcon2;
			
			@FindBy(css = "input[placeholder='dd/mm/yyyy']")
			public
			WebElement todayInput;
			
			@FindBy(css = "div[class='datepicker-days'] th[class='datepicker-switch']")
			public
			WebElement monthBtn;
			
			@FindBy(xpath = "(//th[normalize-space()='January 2023'])[1]")
			public
			WebElement monthBtn2;
			
			@FindBy(xpath = "//th[normalize-space()='January 2023']")
			public
			WebElement January2;
			
			
			@FindBy(xpath = "//span[@class='month focused']")
			public
			WebElement January;
			
			
			@FindBy(xpath = "(//th[@class='clear'])[1]")
			public
			WebElement clearDate;
			
			@FindBy(xpath = "//div[@id='datepicker']/input[1]")
			public
			WebElement startDate;
			
			@FindBy(xpath = "//div[@id='datepicker']/input[2]")
			public
			WebElement endDate;
			
			@FindBy(xpath = "//tr//td[@class='day']")
			public
			 List <WebElement> tableDay;
			
			@FindBy(xpath = "(//li[@class='dropdown'])[2]")
			
			public
			WebElement dropDownDatepicker;
			
			@FindBy(xpath = "//li[@class='dropdown open']//li[1]")
			public
			WebElement DatepickerDropdown;
			
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

