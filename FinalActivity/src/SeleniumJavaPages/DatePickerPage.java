package SeleniumJavaPages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.DatePicker;




public class DatePickerPage extends ReusableComponent{
	

	@BeforeTest
	 public void gotoWebsites() throws InterruptedException {
		gotoWebsite();// method from the Base utility
	
		
	 }
	 
	 @Test
	 public void DatepickerDemo1()  {
		 try {
		 	
			 DatePicker Date = new DatePicker(driver);//instantiation of the page object class to call their variables
		 	Date.dropDownDatepicker.click();// Click the preferred class from navigation menu
		 	 TwosecondsSleep();
		 	Date.DatepickerDropdown.click();
			
			Date date = new Date();
			 // create specified format for date
			 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/Y");
			 String dateToday = dateFormat.format(date);
		
		
			 Date.clickIcon.click(); //clicking Icon and Today button 
			 ThreesecondsSleep();
			 Date.clickToday.click();
			String todayDate = Date.todayInput.getAttribute("value");
			 ThreesecondsSleep();
			Date.clickIcon2.click();
			Assert.assertEquals(todayDate, dateToday, "Date is not today"); //it satisfy the condition if the two value is same or equals in terms of text
			
			
			TwosecondsSleep();
				
			Date.clearDate.click();
			TwosecondsSleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR");
			}
		
			
			
			
		}
			@Test
			public void DatepickerDemo2() throws ParseException {
				
			
				try {
				DatePicker Date = new DatePicker(driver); //instantiation of the page object class to call their variables
				
				Date.startDate.click(); //Clicking the start date 
				Date.monthBtn.click();//Clicking the preferred month
				Date.January.click();
			
				ThreesecondsSleep();
				
			
			for(int i=0; i<Date.tableDay.size(); i++){  // looping through the elements in the table of days
		        String datee = Date.tableDay.get(i).getText();  // Get the text of the date at the current index
		        if(datee.equalsIgnoreCase("12")){ 
		        	Date.tableDay.get(i).click();
		        	i++;
		            break;// break out of the loop after clicking the date
		        }
	    
		    }
			
			  
			ThreesecondsSleep();
			Date.endDate.click();
			for(int i=0; i<Date.tableDay.size(); i++){  // looping through the elements in the table of days
		        String datee = Date.tableDay.get(i).getText();// Get the text of the date at the current index
		        if(datee.equalsIgnoreCase("19")){
		        	Date.tableDay.get(i).click();
		        	i++;
		            break;// break out of the loop after clicking the date   
		            
		        }
	    
		    }
			
			String print = Date.endDate.getAttribute("value");
			String convi = print.toString();
			
			System.out.println(convi);
			
			 // create specified format for date
			 String Una= Date.startDate.getAttribute("value");
			 String pangalawa = Date.endDate.getAttribute("value");
			 
			 
		
			 SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
			 Date date1 = dateFormat.parse(Una);
			 Date date2 = dateFormat.parse(pangalawa);  //converting the text to date object
			 
			  
	        Assert.assertTrue(date1.before(date2), "Date 1 is not less than Date 2");
			
	       
	        
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
