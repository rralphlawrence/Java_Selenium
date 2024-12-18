package SeleniumJavaPages;


import java.util.Iterator;
import java.util.Set;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.Windows;

public class WindowpopsPage extends ReusableComponent{


	@BeforeTest
	 public void gotoWebsites()  {

		
		gotoWebsite();
	 }
	 
	 @Test
	 public void WindowDemo() {
		 try {
		 	Windows window = new Windows(driver);  //instantiation of the page object class to call their variables
			 window.dropDownWindow.click();// Click the preferred class from navigation menu
			 TwosecondsSleep();
			 window.WindowDropdown.click();
		 	 window.followButton.click();
			
		 
		 	waitforWindow(driver); // waits for a new window to appear. 
	       
				ThreesecondsSleep();
			
	        Set<String> allWindows = driver.getWindowHandles(); // Get all window  currently available
	        String mainWindowHandle = driver.getWindowHandle(); // Get the  the main window
	        
	      
	        Iterator<String> iterator = allWindows.iterator(); //  loop through all window 

	        while (iterator.hasNext()) { // if there is a next window just proceed
	        	
	        	String windowHandle = iterator.next();  
	        	driver.switchTo().window(windowHandle);            // Switch to the current window using its handle
	        	
	        	String title = driver.getTitle();
	        	  Assert.assertEquals(allWindows.size(),3); 
	        	System.out.println(title);
	        	
	        	
	        	
	            if (!windowHandle.equals(mainWindowHandle)) {  // Check if the current window is not the main window
	            	
	            	TwosecondsSleep();
	          
	                driver.close();
	               
	            }
	           
	        }
	      
	     
	        driver.switchTo().window(mainWindowHandle); // back to main window
	        TwosecondsSleep();
	     
	        
		 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	 
			 @AfterTest
			 public void closeDriver() {
				
				driver.close();
			 }
}
