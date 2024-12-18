package SeleniumJavaPages;



import java.io.IOException;
import java.util.ArrayList;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import DataDriven.dataDriven;
import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.InputForms;


public class InputFormsPage extends ReusableComponent{

	@BeforeTest
	 public void gotoWebsites() {
		gotoWebsite();
		 
	 }
	
	@Test
	public void InputMessage() throws  InterruptedException, IOException {
		
		
		try {
		InputForms input = new InputForms(driver);//instantiation of the page object class to call their variables
		input.dropDownForms.click();// Click the preferred class from navigation menu
		 TwosecondsSleep();
		input.simpleFormsDropdown.click();
		dataDriven dataa = new dataDriven();
		ArrayList<String> data1 = dataa.getData("Inputform","testdata"); //Creating object to catch data from excel sheet
		input.enterMessage.sendKeys(data1.get(1)); //sending data to web element from excel
		input.showMessage.click();
		String expectMessage = input.enterMessage.getAttribute("value"); 
		String display = "Haysss meeeeen";
		Assert.assertEquals(expectMessage, display); //it satisfy the condition if the two value is same or equals in terms of text
		
		
		TwosecondsSleep();
		input.enterMessage.clear(); //clear text
		input.showMessage.click();
		
		
		
		String withMessage = input.enterMessage.getAttribute("Value"); // if condition if the input field is not null
		if(withMessage != null) {
		
			 Assert.assertTrue(withMessage.length()>0);
			
		}else {
			Assert.assertEquals(withMessage,null);
			System.out.println("Please don't leave it blank"); //condition when the input field is null value
			
		}
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERORR");
		}
		
	}
	
	@Test
	public void InvalidFields() throws IOException {
	
	
		try {
	
		InputForms input = new InputForms(driver);//instantiation of the page object class to call their variables
		dataDriven dataa = new dataDriven();
		ArrayList<String> data1 = dataa.getData("Inputform","testdata"); //Creating object to catch data from excel sheet
		
		TwosecondsSleep();
		
	
		input.sumInput1.sendKeys(data1.get(2)); //Inputting Value from excel
		Sleep(2000);
		input.sumInput2.sendKeys(data1.get(3));//Inputting Value from excel
		Sleep(2000);
		input.getTotal.click();
		TwosecondsSleep();
		String Add1 =input.sumInput1.getAttribute("value");
		String Add2 =input.sumInput2.getAttribute("value");
		int num1 = Integer.parseInt(Add1);
		int num2 = Integer.parseInt(Add2);
		
		System.out.println(Integer.sum(num1, num2));
		String Equals = input.displayValue.getText();
		int num3 = Integer.parseInt(Equals);
		
		Assert.assertEquals(num3,Integer.sum(num1, num2));
		input.sumInput1.clear();
		input.sumInput2.clear();
		Sleep(2000);
		input.sumInput1.sendKeys(data1.get(4));//Inputting Value from excel
		input.sumInput2.sendKeys(data1.get(5));//Inputting Value from excel
		Sleep(2000);
		
		
		String Number2 = input.sumInput1.getAttribute("value");
		String Number1 = input.sumInput2.getAttribute("value");
		
		
		if(isNumeric(Number2 )){ //if else condition if the input value was on integer value
			System.out.println("valid character");
			
		}if (isNumeric(Number1 )){//if else condition if the input value was on integer value
			System.out.println("valid character");
		}else {
			System.out.println("Invalid character");
		}
				
		
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
	
		}
	
	 private boolean isNumeric(String str) { // helper method to check if the value is integer
	        return str.matches("\\d+");
	    }
	
	 @AfterTest
		public void closeDriver() {
			driver.close();
		
		}
	
}
