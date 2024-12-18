package SeleniumJavaPages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataDriven.dataDriven;
import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.DualListbox;

public class DuallistPage extends ReusableComponent{


	@BeforeTest
	 public void gotoWebsites() {
		gotoWebsite(); // method from the Base utility
		 
	 }
	 
	 @Test
	 public void DualListboxDemo() throws IOException {
		 try {
			DualListbox Dual = new DualListbox(driver);//instantiation of the page object class to call their variables
		 	Dual.dropDownDualList.click();// Click the preferred class from navigation menu
		 	TwosecondsSleep();
			Dual.DualLisdDropdown.click();
			TwosecondsSleep();
			
			
			String expected = "bootstrap-duallist";
				
				List <WebElement> data = Dual.Listgroup.findElements(By.tagName("li"));
				for(int i=0; i < data.size(); i++) { //loops to number of elements in the list.
					if(data.get(i).getText().equalsIgnoreCase("bootstrap-duallist")) {
						data.get(i).click();
						String iterateText = data.get(i).getText();
						Assert.assertEquals(iterateText, expected);
						TwosecondsSleep();
						Dual.motoToRight.click();
						TwosecondsSleep();
						i++;
						
					}else {
						System.out.println("NOT FOUND");
					}
				}
				
				dataDriven dataa = new dataDriven();
				ArrayList<String> data1 = dataa.getData("duallist","testdata"); 
				Dual.searchData.sendKeys(data1.get(1));
				
			
			 TwosecondsSleep();
			 
		 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error");
			}
	 }
	 @AfterTest
	 public void driverClose() {
		 driver.close();
		
	 
	 }
	 
	
}
