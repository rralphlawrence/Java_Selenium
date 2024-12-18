package SeleniumJavaPages;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.AlertandModal;


public class AlertandModalPage extends ReusableComponent{

	@BeforeTest
	 public void gotoWebsites()  {
			gotoWebsite();
		
	 }
	 	
			@Test(priority = 1)
			 public void autoClose() { // Auto close Modal
				 try {
					 
					 AlertandModal alert = new AlertandModal(driver); //instantiation of the page object class to call their variables
		 			 alert.dropDownAlert.click(); // Click the preferred class from navigation menu
		 			 alert.AlertDropdown.click();
		 			 TwosecondsSleep();
				 	alert.autoCloseBtn.click();
					String autoClose =  alert.autoCloseAlert.getText();
					
					
					 if (autoClose.isEmpty()) {  // if else condition if the variables didn't pop up in the screen
						 Assert.assertTrue(autoClose.isEmpty()); //it satisfy the condition if the value is null
						 System.out.println("No modal displayed");
						 
					 }else {
						 
					 Assert.assertEquals("I'm an autocloseable success message. I will hide in 5 seconds.",autoClose);
					 System.out.println(autoClose);
					 FivesecondsSleep();
					 }
						
						
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Error");
					}
				 }
				
				
			@Test(priority = 2)
			
			
			public void normalAlert(){ // Normal Modal
				 try {
				
				 AlertandModal alert = new AlertandModal(driver);//instantiation of the page object class to call their variables
				 alert.normalBtn.click();// Click the preferred class from navigation menu
				String normalAlertModal =  alert.normalAlert.getText();
				 if (normalAlertModal.isEmpty()) {
					 Assert.assertTrue(normalAlertModal.isEmpty());//it satisfy the condition if the value is null
					 System.out.println("No modal displayed");
					 
				 }else {
					 
				 Assert.assertEquals("×\n"+ "I'm a normal success message. To close use the appropriate button.",normalAlertModal);
				 System.out.println(normalAlertModal);
				 ThreesecondsSleep();
				 alert.normalAlertEks.click();
				 }
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			@Test(priority = 3)
			public void AutocloseWarning() {
			
				/* AUTO CLOSE WARNING MODAL */
				
				 try {
				 AlertandModal alert = new AlertandModal(driver);//instantiation of the page object class to call their variables
				 alert.autocloseWarningBtn.click();// Click the preferred class from navigation menu
				String autocloseWarningModal =  alert.autocloseWarning.getText();
				 
				 if (autocloseWarningModal.isEmpty()) {
					 Assert.assertTrue(autocloseWarningModal.isEmpty());//it satisfy the condition if the value is null
					 System.out.println("No modal displayed");
					 
				 }else {
					 
				 Assert.assertEquals("I'm an autocloseable warning message. I will hide in 3 seconds.",autocloseWarningModal);
				 System.out.println(autocloseWarningModal);
				 FivesecondsSleep();
	
			 }
				 } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error");
				}
			 }
		
			@Test(priority = 4)
			public void normalWarning(){
				
				
				
				 /* NORMAL WARNING MODAL */
				 try {
				 AlertandModal alert = new AlertandModal(driver);//instantiation of the page object class to call their variables
				 alert.normalWarningBtn.click();// Click the preferred class from navigation menu
				String normalWarningModal =  alert.normalWarning.getText();
				 
				 if (normalWarningModal.isEmpty()) {
					 Assert.assertTrue(normalWarningModal.isEmpty());//it satisfy the condition if the value is null
					 System.out.println("No modal displayed");
					 
				 }else {
					 
				 Assert.assertEquals("×\n"+"I'm a normal warning message. To close use the appropriate button.",normalWarningModal);
				 System.out.println(normalWarningModal);
				
				 	ThreesecondsSleep();
					 alert.normalWarningEks.click();
				 }
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error");
				}
				
			 }
		
			@Test(priority = 5)
			public void autoCloseDanger(){
				 try {
				 AlertandModal alert = new AlertandModal(driver);//instantiation of the page object class to call their variables
				 alert.autoCloseDanger.click();	// Click the preferred class from navigation menu
				String	autoCloseDanger = 	 alert.autoCloseDangerT.getText();
				
				if (autoCloseDanger.isEmpty()) {
					 Assert.assertTrue(autoCloseDanger.isEmpty());//it satisfy the condition if the value is null
					 System.out.println("No modal displayed");
					 
				 }else {
					 
				 Assert.assertEquals("I'm an autocloseable danger message. I will hide in 5 seconds.",autoCloseDanger);
				 System.out.println(autoCloseDanger);
				 FivesecondsSleep();
				
					
			}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error");
			}
			
				
		}
			
		
			@Test(priority = 6)
			public void normalDanger()  {
				 try {
				
				 /* NORMAL DANGER MODAL */
				AlertandModal alert = new AlertandModal(driver);//instantiation of the page object class to call their variables
				 alert.normalDangerBtn.click();// Click the preferred class from navigation menu
				String normalDanger =  alert.normalDangerT.getText();
				 
				 if (normalDanger.isEmpty()) {
					 Assert.assertTrue(normalDanger.isEmpty());//it satisfy the condition if the value is null
					 System.out.println("No modal displayed");
					 
				 }else {
					 
				 Assert.assertEquals("×\n"+"I'm a normal danger message. To close use the appropriate button.",normalDanger);
				 System.out.println(normalDanger);
					ThreesecondsSleep();
					alert.normalDangerEks.click();
				
				
			 }
				 } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Error");
					}
				
		}
		
			@Test(priority = 7)
			 /* AUTO CLOSE INFO MODAL */
			public void autoCloseInfo() {
				 try {
						AlertandModal alert = new AlertandModal(driver);//instantiation of the page object class to call their variables
						alert.autoCloseInfoBtn.click();	// Click the preferred class from navigation menu
						String	AutoCloseInfo =  alert.autoCloseInfoT.getText();
						
						if (AutoCloseInfo.isEmpty()) {
							 Assert.assertTrue(AutoCloseInfo.isEmpty());//it satisfy the condition if the value is null
							 System.out.println("No modal displayed");
							 
						 }else {
							 
						 Assert.assertEquals("I'm an autocloseable info message. I will hide in 6 seconds.",AutoCloseInfo);
						 System.out.println(AutoCloseInfo);
						
							SixsecondsSleep();
						
					 }
						 } catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								System.out.println("Error");
							}
				}
					
			@Test(priority = 8)
			public void normalInfo() {
				
				 /* NORMAL INFO MODAL */
				
		 try {
				AlertandModal alert = new AlertandModal(driver);//instantiation of the page object class to call their variables
				 alert.normalInfoBtn.click();// Click the preferred class from navigation menu
				String normalInfo =  alert.normalInfoT.getText();
				 
				 if (normalInfo.isEmpty()) {
					 Assert.assertTrue(normalInfo.isEmpty());//it satisfy the condition if the value is null
					 System.out.println("No modal displayed");
					 
				 }else {
					 
				 Assert.assertEquals("×\n"+"I'm a normal info message. To close use the appropriate button.",normalInfo);
				 System.out.println(normalInfo);
				 ThreesecondsSleep();
				 alert.normalInfoEks.click();
			 }
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
