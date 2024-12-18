package SeleniumJavaPages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataDriven.dataDriven;
import SeleniumJava.AbstractComponents.ReusableComponent;

import SeleniumJava.pageobjects.InputFormSubmit;

public class InputFormSubmitPage extends ReusableComponent {

	@BeforeTest
	 public void gotoWebsites(){
		gotoWebsite(); // method from the Base utility
		
		
	 }
	 
	 @Test
		public void inputInfos() throws IOException {
			
		
		 try {
			 InputFormSubmit inputform = new InputFormSubmit(driver);//instantiation of the page object class to call their variables
			 inputform.dropDownInputform.click();
			 TwosecondsSleep();
			 inputform.inputFormDropdown.click();
		  	dataDriven dataa = new dataDriven(); 
			ArrayList<String> data1 = dataa.getData("Information","testdata"); //Creating object to catch data from excel sheet
			
			OnesecondsSleep();
			inputform.firstName.sendKeys(data1.get(1)); //Inputting Value from excel
			OnesecondsSleep();
			inputform.lastName.sendKeys(data1.get(2)); //Inputting Value from excel
			OnesecondsSleep();
			inputform.email.sendKeys(data1.get(3)); //Inputting Value from excel
			OnesecondsSleep();
			inputform.phone.sendKeys("1234567890"); // inputting improper value
			OnesecondsSleep();
			inputform.address.sendKeys(data1.get(5)); //Inputting Value from excel
			OnesecondsSleep();
			inputform.city.sendKeys(data1.get(6)); //Inputting Value from excel
			OnesecondsSleep(); 
			Select dropdownDay = new  Select(inputform.selectState); // creating object to use function for dropdown
			dropdownDay.selectByVisibleText(data1.get(7)); //Inputting Value from excel
			OnesecondsSleep();
			inputform.zip.sendKeys(data1.get(8)); //Inputting Value from excel
			OnesecondsSleep();
			inputform.website.sendKeys(data1.get(9)); //Inputting Value from excel
			OnesecondsSleep();
			inputform.hosting.click();
			inputform.comment.sendKeys(data1.get(10)); //Inputting Value from excel
			OnesecondsSleep();
			inputform.btnSubmit.click();
			OnesecondsSleep();
			
			String shortNumber = inputform.phone.getAttribute("value"); //getting value from input value of phone
			int actualValue = shortNumber.length();
			int ten = 10; // declaring integer
		
			
			if(assertValues(actualValue, ten)) { //checking value if the actual value is equal to 10 digits
				
				System.out.println("Proper number");
			}else {
			System.out.println("Invalid number");
			
			//Assertion 
			Assert.assertTrue(shortNumber.length()<10); 
			
			TwosecondsSleep();
			inputform.phone.clear(); //clearing the data
			inputform.phone.sendKeys(data1.get(4)); // sending proper data to input field from excel
			
			TwosecondsSleep();
			inputform.btnSubmit.click();
			
			}
			
			
			String firstname = inputform.firstName.getAttribute("value");
			String lastName = inputform.lastName.getAttribute("value");
			String email = inputform.email.getAttribute("value");
			String address = inputform.address.getAttribute("value");
			String city = inputform.city.getAttribute("value");
			
			//Assertion 
			
			Assert.assertTrue(!firstname.isEmpty(), "Input field is empty");
			Assert.assertTrue(!lastName.isEmpty(), "Input field is empty");
			Assert.assertTrue(!email.isEmpty(), "Input field is empty");
			Assert.assertTrue(!address.isEmpty(), "Input field is empty");
			Assert.assertTrue(!city.isEmpty(), "Input field is empty");
			System.out.println(firstname+" "+lastName);
		
		 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error");
			}
	
		}
		 //helper method to check if the actual value satisfy the proper length of integer
		 private static boolean assertValues(int actualValue, int ten) {
		        try {
		            Assert.assertEquals(actualValue, ten);
		            return true; // Assertion passed
		        } catch (AssertionError e) {
		            return false; // Assertion failed
		        }
		    }
	 
	 @AfterTest
	 public void closeDriver() {
		 driver.close();
		
	 }
	
}
