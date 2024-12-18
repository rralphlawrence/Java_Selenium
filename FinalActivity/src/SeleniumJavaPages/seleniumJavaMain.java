package SeleniumJavaPages;
import java.io.IOException;

import java.text.ParseException;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import SeleniumJava.AbstractComponents.ReusableComponent;





public class seleniumJavaMain extends ReusableComponent{
	
		@BeforeTest
		 public void goWebsite() {
			
			
		
			gotoWebsite();
			 	
			// DriverManager Contains the Get link and driver manager 
			
		 }
		
		 @Test(priority = 1)
		 public void SimpleInputForms() throws  IOException, InterruptedException{
			 InputFormsPage normalInput  = new InputFormsPage(); // creating instance to call a contractor of InputFormsPage class
			 // (Form2 input fields elements)	 
			 
			normalInput.InputMessage();
			normalInput.InvalidFields();
		 	 
		 }	 
		 
		 
		 @Test(priority = 2)
		 public void Ajaxforms() throws IOException, InterruptedException  {
			 AjaxFormPage ajax = new AjaxFormPage();// creating instance to call a contractor of AjaxFormPage class
			
			ajax.AjaxFormDemo();
			ajax.AjaxFormDemo2();
		 }
		
			
		 @Test(priority = 3)
		 public void RadioButton() {
			 RadioButtonPage radio = new RadioButtonPage(); // creating instance to call a contractor of RadioButtonPage class
			 radio.radioButtonDemo1();
			 radio.radioButtonDemo2();
		 }
			 	
		 @Test(priority = 4)
		 public void checkBox() {
			 CheckBoxPage checkBox = new CheckBoxPage(); // creating instance to call a contractor of CheckBoxPage class
			 checkBox.checkBoxdemo();
		 }
		 
		 @Test(priority = 5)
		 public void selectDropdown()  {
			 DropDownPage dropDown = new DropDownPage(); // creating instance to call a contractor of DropDownPage class
			 dropDown.selectDropdownList1();
			 dropDown.selectDropdownList2();
		 }
		 
		 @Test(priority = 6)
		 public void inputForms() throws InterruptedException, IOException {
			 InputFormSubmitPage inputForm = new InputFormSubmitPage(); // creating instance to call a contractor of InputFormSubmitPage class
			 inputForm.inputInfos();
		 }
		 
		 @Test(priority = 7)
		 public void JquerySelect()   {
			 JquerySelectPage Jquery = new  JquerySelectPage(); // creating instance to call a contractor of JquerySelectPage class
			 Jquery.JquerySelectDemo();
			 Jquery.JquerySelectDemo2();
		 }
		 
		 
		 @Test(priority = 9)
		 public void datePicker() throws ParseException {
			 DatePickerPage datepick = new DatePickerPage(); // creating instance to call a contractor of DatePickerPage class
			 datepick.DatepickerDemo1();
			 datepick.DatepickerDemo2();
		 }
		 
		 @Test(priority = 10)
		 public void TableSort(){
			 TableSortPage table = new TableSortPage(); // creating instance to call a contractor of TableSortPage class
			 table.TableSortDemo();
		 }
		 
		 @Test(priority = 11)
		 public void progresBar() {
			 ProgressbarPage progress = new ProgressbarPage(); // creating instance to call a contractor of ProgressbarPage class
			 progress.ProgressbarDemo();
		 }
		 
		 @Test(priority = 12)
		 public void bootstrapAlert()  {
			 AlertandModalPage alert = new AlertandModalPage(); // creating instance to call a contractor of AlertandModalPage class
			 alert.autoClose();
			 alert.normalAlert();
			 alert.AutocloseWarning();
			 alert.normalWarning();
			 alert.autoCloseDanger();
			 alert.normalDanger();
			 alert.autoCloseInfo();
			 alert.normalInfo();
			 
			
		 }
		 
		 @Test(priority = 13)
		 public void bootstrapModal() {
			 BootstrapModalPage Bootstrap = new BootstrapModalPage();// creating instance to call a contractor of BootstrapModalPage class
			 Bootstrap.BootstrapModal1();
			 Bootstrap.BootstrapModal2();
		 }
		 
		 @Test(priority = 14)
		 public void WindowPopup() {
			 WindowpopsPage windows = new WindowpopsPage();// creating instance to call a contractor of WindowpopsPage class
			 windows.WindowDemo();
		 }
		 
		 @Test(priority = 15)
		 public void DualListbox() throws IOException {
			 DuallistPage dual = new  DuallistPage();// creating instance to call a contractor of DuallistPage class
			 dual.DualListboxDemo();
		 }
		 
		 
		 @Test(priority = 16)
		 public void Datalistbox() throws IOException {
			 DatalistPage Data = new DatalistPage();// creating instance to call a contractor of DatalistPage class
			 Data.DataListDemo();
		 }
		 
		 
		 
		
		@AfterTest
		public void quitDriver() {
		
			driver.quit();
		}
		 
}
			 
		 
		 
		
	
	


