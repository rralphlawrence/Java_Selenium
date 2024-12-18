package SeleniumJavaPages;


import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.DropDown;


public class DropDownPage extends ReusableComponent{


	@BeforeTest
	 public void gotoWebsites() {
		gotoWebsite();// method from the Base utility
	 }
	
	
	 @Test
	 public void selectDropdownList1()  {
		 
		
		  try {
			DropDown Drop = new DropDown(driver);//instantiation of the page object class to call their variables
		 	Drop.dropDownSelectDrop.click();// Click the preferred class from navigation menu
		 	 TwosecondsSleep();
		 	Drop.selectDropDown.click();
			Select dropdownDay = new  Select(Drop.selectDay); // creating object name from the selectDay to provide dropdown functions
			dropdownDay.selectByVisibleText("Wednesday"); // clicking the value of text 
			String SelectValue = Drop.selectedValue.getText();
			
			ThreesecondsSleep();
		
			 String expectedText = "Day selected :- Wednesday";
			Assert.assertEquals(SelectValue, expectedText, "Element text is incorrect.");
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR");
			}
			 
		
		}
	 	@Test
		public void selectDropdownList2() {
	 	
	 		
	 		 try {
	 			DropDown Drop = new DropDown(driver);//instantiation of the page object class to call their variables
				Drop.cityOptions.click();  //clicking preferred option
				Drop.cityButton.click();
				 String getSelect = Drop.getAllSelected.getText(); //validation text
				 String expectedText = "First selected option is : New Jersey";
				Assert.assertEquals(getSelect, expectedText, "Element text is incorrect."); //it satisfy the condition if the two value is same or equals in terms of text
				
				ThreesecondsSleep();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error");
				}
				 
				
		}
	 	
		
	 @AfterTest
	 public void closeDriver() {
		 driver.close();
		
	 }
	
}
