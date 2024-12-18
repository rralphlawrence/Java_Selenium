package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class dataDriven {
	
	
	//identify testcases by scanning the entire first row
	
	

	public ArrayList<String> getData(String Row, String Column) throws IOException { 
		
		ArrayList<String> a= new ArrayList<String>(); // Create an ArrayList to store the data
		//FILE INPUT STREAM ARGUEMENT
		
		FileInputStream fis = new FileInputStream("/Users/ralphlawrencereyes/Documents/datadrivens/inputdata.xlsx");  // File input stream to read the Excel file
		try (XSSFWorkbook Workbook = new XSSFWorkbook(fis)) {
			int sheets = Workbook.getNumberOfSheets();     // Get the number of sheets in the workbook
			for (int i=0; i<sheets; i++) {
				
				if (Workbook.getSheetName(i).equalsIgnoreCase("testdata")) {  // Check if the sheet name matches the specified sheet name ("testdata")
					XSSFSheet sheet = Workbook.getSheetAt(i);
					
					Iterator<Row> rows =  sheet.iterator();  // Iterator to loop through rows in the sheet
					Row firstrow = rows.next(); // Get the first row (header row)
					Iterator <Cell> ce =  firstrow.cellIterator();
					
					int k = 0;
					int column = 0;
					
					
					while(ce.hasNext()) {
						Cell value =ce.next(); // Loop through cells in the first row to find the desired column
						if(value.getStringCellValue().equalsIgnoreCase(Column)){
							// DESIRED COLUMN
							
							column = k;
							
						}
						k++;
						
					}
					
					
					
					
					// Scan column and identify the specific row
					
					while (rows.hasNext()) {
						
						Row R = rows.next();
						if (R.getCell(column).getStringCellValue().equalsIgnoreCase(Row) ) {// Check if the cell in the specified column of the current row matches the specified row name
							//[pull all the data of that row
							
							Iterator<Cell> cv = R.cellIterator(); // Iterate through cells in the current row to fetch data
							while(cv.hasNext()) {
								
								Cell c= cv.next(); // Get the next cell
								
								
								if (c.getCellType()==CellType.STRING) {    // If the cell type is STRING, add the string value to the ArrayList
									a.add(c.getStringCellValue());
								}else {
									
									a.add(NumberToTextConverter.toText(c.getNumericCellValue())); // convert to text format
								
								}
								
								
								
							}
							
						}
						
						
						
					}
					
					
					return a;
				}
			
				
				
			}
		}
		
		return a;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	}

}
