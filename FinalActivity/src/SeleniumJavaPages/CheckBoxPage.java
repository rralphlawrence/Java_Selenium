package SeleniumJavaPages;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;

import SeleniumJava.pageobjects.CheckBox;



public class CheckBoxPage extends ReusableComponent{
	
	 @BeforeTest
	 public void gotoWebsites()  {
		 gotoWebsite() ;// method from the Base utility
	 }

	 @Test
	 public void checkBoxdemo()  {
		
		  
		
		 try {
			 CheckBox check = new CheckBox(driver); //instantiation of the page object class to call their variables
		 	check.dropDownCheckbox.click();// Click the preferred class from navigation menu
		 	 TwosecondsSleep();
		 	check.checkBoxDropdown.click();
			check.clickCheckBox1.click();
			Assert.assertTrue(check.clickCheckBox1.isSelected());//It satisfy the condition if the checkbox was checked
			
			ThreesecondsSleep();

			String checkboxName = 	check.checkboxLabel.getText(); //getting the text value of label of checkbox
			System.out.println(checkboxName);
			Assert.assertEquals(checkboxName,"Success - Check box is checked"); //it satisfy the condition if the two value is same or equals in terms of text
			check.buttonCheckAll.click();
			ThreesecondsSleep();;
			String expectedText = "Uncheck All"; //getting the text value of label of validation
			Assert.assertEquals(check.buttonCheckAll.getAttribute("value"), expectedText, "Element text is incorrect.");//it satisfy the condition if the two value is same or equals in terms of text
			System.out.println(	check.buttonCheckAll.getAttribute("value"));
		
			check.lastCheckBox.click();
			ThreesecondsSleep();;
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
