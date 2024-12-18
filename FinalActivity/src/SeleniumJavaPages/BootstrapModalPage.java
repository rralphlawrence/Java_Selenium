package SeleniumJavaPages;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.BootstrapModals;


public class BootstrapModalPage extends ReusableComponent{


	 @BeforeTest
	 public void gotoWebsites()  {
		gotoWebsite();// method from the Base utility
		
	 }
	 
	 	By modalContainer = By.xpath("//div[@id='myModal0']//div[@class='modal-content']");
		By modalBody2 = By.xpath("//div[@id='myModal']//div[@class='modal-content']");
		By lastButton = By.xpath("	(//a[@class='btn btn-primary'][normalize-space()='Save changes'])[3]");
		
		
		@Test
		public void BootstrapModal1() {
			try {
			BootstrapModals Bootstrap = new BootstrapModals(driver); //instantiation of the page object class to call their variables
			Bootstrap.dropDownBootstrap.click();// Click the preferred class from navigation menu
			 TwosecondsSleep();
			Bootstrap.BootstrapDropdown.click();
			Bootstrap.modalButton1.click();
			Bootstrap.modalBody = waitForElementToAppear(modalContainer); //waiting the element before it goes to assertion
			Assert.assertEquals("×\n"  //it satisfy the condition if the two value is same or equals in terms of text
					+ "Modal Title\n"
					+ "This is the place where the content for the modal dialog displays\n"
					+ "Close Save changes",Bootstrap.modalBody.getText());
			System.out.println(Bootstrap.modalBody.getText());
			ThreesecondsSleep();
			Bootstrap.modalSavebutton.click();
			ThreesecondsSleep();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error");
			}
			
		}
		@Test
		public void BootstrapModal2()  {
			try {
			BootstrapModals Bootstrap = new BootstrapModals(driver);//instantiation of the page object class to call their variables
			Bootstrap.modalButton2.click();// Click the preferred class from navigation menu
			Bootstrap.modalBodyContent = waitForElementToAppear(modalBody2);//waiting the element before it goes to assertion
			Bootstrap.lunchModal.click();
			
			ThreesecondsSleep();
			
			Assert.assertTrue(Bootstrap.secondModalContent.getText().contains("This is the place where the content for the modal dialog displays."));  //it satisfy the condition if the two value is same or equals in terms of text
			System.out.println(Bootstrap.secondModalContent.getText());
			Bootstrap.secondModalContent =waitForElementToAppear(lastButton);
			Bootstrap.secondModalContent.click();
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error");
			}
		}


	 @AfterTest
	 public void closeDriver() {
		driver.close();
	
	 }

}
