package SeleniumJavaPages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.JquerySelect;

public class JquerySelectPage extends ReusableComponent{


	@BeforeTest
	 public void gotoWebsites()  {
		gotoWebsite();// method from the Base utility

	 }
	 
	 @Test
	 public void JquerySelectDemo()  {
		 try {
		 
			  JquerySelect jquery = new JquerySelect(driver);//instantiation of the page object class to call their variables
			 jquery.dropDownJquery.click(); // Click the preferred class from navigation menu
			 TwosecondsSleep();
			 jquery.JqueryDropdown.click();
			 TwosecondsSleep();
			 jquery.selectCountry.click(); //Selecting values
			 jquery.clickCountry.click();
			 
			 String countryValue = jquery.countryValue.getText(); // getting the text value of Country to input in assertion
			 Assert.assertEquals(countryValue, "United States of America");	
			 System.out.println(countryValue);
			 
			
				TwosecondsSleep();
			
			 jquery.inputState1.sendKeys("alabama");
			 TwosecondsSleep();// inoutting values to the variable
			 jquery.clickState1.click();
			 TwosecondsSleep();
			 jquery.inputState2.sendKeys("Alaska");
			 TwosecondsSleep();// inoutting values to the variable
			 jquery.clickState2.click();
			 String state1 = jquery.Alabama.getAttribute("title");
			 String state2 = jquery.Alaska.getAttribute("title");
			 
			 
			 //assertions
			 Assert.assertEquals(state1, "Alabama");	
			 Assert.assertEquals(state2, "Alaska");	
			 System.out.println(state1);
			 System.out.println(state2);
			 
			 TwosecondsSleep();
			 jquery.clickTerretories.click();
			 jquery.selectPuertoRIco.sendKeys("Puerto Rico");
			 TwosecondsSleep();
			 jquery.enterKey.sendKeys(Keys.RETURN);
			 String state3 = jquery.PuertoRico.getAttribute("title");
			 Assert.assertEquals(state3, "Puerto Rico");	
			 System.out.println(state3);
			 
			 
		 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("System 609");
			}
		}
	 @Test
		public void JquerySelectDemo2()  {
		 try {
		 	JquerySelect jquery = new JquerySelect(driver);
			 Select dropdownFile = new  Select(jquery.progLanguage); //creating object to use for drop down function
			 dropdownFile.selectByVisibleText("PHP");
			 String Textprogramming = dropdownFile.getFirstSelectedOption().getText();
			 Assert.assertEquals(Textprogramming,"PHP");
			 
			 TwosecondsSleep();
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
