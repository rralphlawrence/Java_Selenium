package SeleniumJavaPages;




import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.RadioButton;


public class RadioButtonPage extends ReusableComponent{
	
	 

	@BeforeTest
	 public void gotoWebsites() {
	
		gotoWebsite(); // method from the Base utility
	 }
	 
	 @Test
	 public void radioButtonDemo1() {
		  
		 
		 try {
			 RadioButton radio = new RadioButton(driver); //instantiation of the page object class to call their variables
			 radio.dropDownRadioButton.click(); // Click the preferred class from navigation menu
			 TwosecondsSleep();
			 radio.radioButtonDropdown.click();
				//Clicking the female radio button and validating text or message
			 Assert.assertFalse(radio.radioButtonDropdown.isSelected());
				TwosecondsSleep();
			 radio.radioButtonFemale.click();
			 radio.buttonChecker.click();
			String buttomMessage =  radio.radioButtonText.getText(); //declaring variable to get radio button text 
			
			
			String expectedText = "Radio button 'Female' is checked";
			Assert.assertEquals(buttomMessage, expectedText, "Element 2 text is incorrect."); // Assertion to satisfy if the variable text is equals
			System.out.println(buttomMessage);
			
				TwosecondsSleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("609");
				
				
			}
			
		}
		
	 	@Test
		public void radioButtonDemo2() {
	 		
	 		
	 		
	 		 try {
	 		RadioButton radio = new RadioButton(driver);
			 radio.radioGender.click(); // Click the preferred class from navigation menu
			 radio.radioAgegroup.click();
			 radio.radioOnclick.click();
			
				Thread.sleep(2000);
			
			String radioValues =  radio.radioMessage.getText();  //declaring variable to get radio button text 
			String expectedText = "Sex : Female"
					+ "\nAge group: 15 - 50";
			Assert.assertEquals(radioValues, expectedText, "Element 2 text is incorrect.");  // Assertion to satisfy if the variable text is equals
			System.out.println(radioValues);
			
			
	 		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR");
				
			}
			
		}
	 
		 @AfterTest
		 public void closing() {
			 driver.close();
		
		 }

}
