package SeleniumJavaPages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.TableSorted;



public class TableSortPage extends ReusableComponent{
	 List<String> Name;
	

	@BeforeTest
	 public void gotoWebsites() {
		 gotoWebsite(); // method from the Base utility	 
	 }	 
	
	 @Test
	 public void TableSortDemo() {
		 	
		
		 
		 try {
          TableSorted table = new TableSorted(driver); //instantiation of the page object class to call their variables
		 table. dropDownTableSort.click();    // Clicking on the drop down for table sorting
		 TwosecondsSleep();
		 table.TableSortDropdown.click();
		 Select dropEntries = new Select(table.showEntries);  // creating object to use function for dropdown
		 dropEntries.selectByVisibleText("10");
		
		 TwosecondsSleep();
	
		 table.tableSearch.sendKeys("Cox"); // Entering a search term in the table search field
		 
		// Using Stream filter and map table rows containing "Marshall" and collecting the results into a List
	

	        List<WebElement> Names=driver.findElements(By.xpath("//tr/td[1]"));

	        //1 results

	       List<WebElement> filteredList= Names.stream().filter(name->name.getText().contains("A. Cox")).

	        collect(Collectors.toList());

	       //1 result
	      
	       

	       Assert.assertEquals(Names.size(), filteredList.size());

	       Names.forEach(name -> System.out.println(name.getText()));
	       filteredList.forEach(name -> System.out.println(name.getText()));
		 ThreesecondsSleep();
		 	
		 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR ");
			}
		
		 
		 
	}
	 
	 
	 
	 @AfterTest
	 public void closeDriver() {
		 driver.close();
	 }
	
}
