package SeleniumJava.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigation {

	WebDriver driver;
	public  Navigation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	WebElement dropDownForms;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[1]")
	WebElement simpleFormsDropdown;
	
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	WebElement dropDownCheckbox;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[2]")
	WebElement checkBoxDropdown;
	
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	WebElement dropDownRadioButton;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[3]")
	WebElement radioButtonDropdown;

	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	WebElement dropDownSelectDrop;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[4]")
	WebElement selectDropDown;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	WebElement dropDownInputform;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[5]")
	WebElement inputFormDropdown;
	
	
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	WebElement dropDownJquery;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[7]")
	WebElement JqueryDropdown;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[2]")
	WebElement dropDownDatepicker;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[1]")
	WebElement DatepickerDropdown;
	
	
	@FindBy(xpath = "(//li[@class='dropdown'])[3]")
	WebElement dropDownTableSort;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[4]")
	WebElement TableSortDropdown;
	
	
	@FindBy(xpath = "(//li[@class='dropdown'])[4]")
	WebElement dropDownProgressBar;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[2]")
	WebElement progressBarDropdown;
	
	
	@FindBy(xpath = "(//li[@class='dropdown'])[5]")
	WebElement dropDownAlert;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[1]")
	WebElement AlertDropdown;

	
	@FindBy(xpath = "(//li[@class='dropdown'])[5]")
	WebElement dropDownBootstrap;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[2]")
	WebElement BootstrapDropdown;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[5]")
	WebElement dropDownWindow;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[3]")
	WebElement WindowDropdown;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[6]")
	WebElement dropDownDualList;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[1]")
	WebElement DualLisdDropdown;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[6]")
	WebElement dropDownDataList;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[3]")
	
	WebElement DataListDropdown;
	
	@FindBy(xpath = "(//li[@class='dropdown'])[1]")
	public
	WebElement dropDownAjaxform;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[6]")
	public
	WebElement AjaxDropdown;
	
	public WebElement waitForElementToAppear(By findBy) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public  void waitForProgressBar(WebDriver driver, int targetProgress, By findBy) {
  	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30) ); // Set your desired timeout
    

      // Wait until the progress bar reaches the target progress
      wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
  }
	
	public void waitforWindow(WebDriver driver) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	}

	public void AlertDemoDropdown() {
		// TODO Auto-generated method stub
		dropDownAlert.click();
		AlertDropdown.click();
	}
	
	public void DataListDropdown() {
		// TODO Auto-generated method stub
		dropDownDataList.click();
		DataListDropdown.click();
	}
	
	public void DualListDropdown() {
		// TODO Auto-generated method stub
		dropDownDualList.click();
		DualLisdDropdown.click();
	}
	
	public void WindowDropdown() {
		// TODO Auto-generated method stub
		dropDownWindow.click();
		WindowDropdown.click();
	}
	
	
	
	public void BootstrapDemoDropdown() {
		// TODO Auto-generated method stub
		dropDownBootstrap.click();
		BootstrapDropdown.click();
	}
	
	public void inputDemoDropdown() {
		// TODO Auto-generated method stub
		dropDownForms.click();
		simpleFormsDropdown.click();
	}
	
	public void ProgressBarDemoDropdown() {
		// TODO Auto-generated method stub
		dropDownProgressBar.click();
		progressBarDropdown.click();
	}

	public void checkBoxDemoDropdown() throws InterruptedException {
		// TODO Auto-generated method stub
		dropDownCheckbox.click();
		checkBoxDropdown.click();
		 Thread.sleep(1000);
	}
	
	public void radioButtonDemoDropdown() throws InterruptedException {
		dropDownRadioButton.click();
		radioButtonDropdown.click();
		 Thread.sleep(1000);
	}
	
	public void selectDropdownListDropdown() {
		dropDownSelectDrop.click();
		selectDropDown.click();
		
	}
	
	public void inputFormsDropdown() {
		dropDownInputform.click();
		inputFormDropdown.click();
		
	}
	
	public void ajaxFormsDropdown() {
		dropDownAjaxform.click();
		AjaxDropdown.click();
		
	}
	
	public void JqueryDropdown() {
		dropDownJquery.click();
		JqueryDropdown.click();
		
	}

	public void DatepickerDropdown() {
		dropDownDatepicker.click();
		DatepickerDropdown.click();
		
	}
	
	public void TableSortDropdown() {
		dropDownTableSort.click();
		TableSortDropdown.click();
		
	}
	
	
	
	
}
