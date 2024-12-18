package SeleniumJavaPages;

import java.io.IOException;
import java.util.ArrayList;



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataDriven.dataDriven;
import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.AjaxForm;



public class AjaxFormPage extends ReusableComponent{
	
	@BeforeTest
	public void gotoLink() {
			
		gotoWebsite(); // method from the Base utility
			
		}
		
		@Test
		public void AjaxFormDemo() throws IOException {
			
			 try {

			  AjaxForm ajax = new AjaxForm(driver); //instantiation of the page object class to call their variables
			
				
			  
			ajax.dropDownAjaxform.click();  // Click the preferred class from navigation menu
			 TwosecondsSleep();
			ajax.AjaxDropdown.click();
			dataDriven dataa = new dataDriven();
			ArrayList<String> data1 = dataa.getData("Ajaxform","testdata"); //Creating object to catch data from excel sheet
			ajax.inputTitle.sendKeys(data1.get(1));  //sending data to web element from excel
			ajax.description.sendKeys(data1.get(2));  //sending data to web element from excel
			ajax.submitControl.click();
			ThreesecondsSleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR"); 
			}
			
			
		}
		@Test
		public void AjaxFormDemo2() {
			
			try {
			  AjaxForm ajax = new AjaxForm(driver);
		
			  String Result = ajax.submitResult.getText(); //Getting text from the validation result
			
			 String expectedText = "Form submited Successfully!";
			 Assert.assertEquals(Result, expectedText, "Element text is incorrect."); // Asserting two variables if they are equal in terms of their text value
			 System.out.println(Result);
			
				ThreesecondsSleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR");
			}
			
		}
		
		
		@AfterTest
		public void closeDriver() {
			driver.close();
		
		
		}
	
	 
	
	
}


