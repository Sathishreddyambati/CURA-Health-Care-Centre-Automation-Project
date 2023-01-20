package baseClassPages;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {
	
	XSSFRow row;
	XSSFCell cell;
	
	public void WritingData() throws IOException {
	
	 XSSFWorkbook workBook = new XSSFWorkbook();
		
	 
		XSSFSheet workSheet = workBook.createSheet("Appointment");
		 row = workSheet.createRow(0);
		 cell = row.createCell(0);
		 cell.setCellValue("Name");
		 
		 cell = row.createCell(1);
		 cell.setCellValue("Nikhila Chandran");
		 
		 cell = row.createCell(2);
		 cell.setCellValue("Gourav Ramesh");
		 
		 cell = row.createCell(3);
		 cell.setCellValue("Kasanaboina Akanksha");
		 
		 cell = row.createCell(4);
		 cell.setCellValue("Ambati Reddy");
		 
		 cell = row.createCell(5);
		 cell.setCellValue("Pawar Karan");
		 
		 row = workSheet.createRow(1);
		 cell = row.createCell(0);
		 cell.setCellValue("Facility");
		 
		 cell = row.createCell(1);
		cell.setCellValue("Hongkong CURA Healthcare Center");
		
		cell = row.createCell(2);
		cell.setCellValue("Hongkong CURA Healthcare Center");
		
		cell = row.createCell(3);
		cell.setCellValue("Hongkong CURA Healthcare Center");
		
		cell = row.createCell(4);
		cell.setCellValue("Hongkong CURA Healthcare Center");
		
		row.createCell(5);
		cell.setCellValue("Hongkong CURA Healthcare Center");
		
		
		row = workSheet.createRow(2);
		 cell = row.createCell(0);
		 cell.setCellValue("Apply for hospital readmission");
		 
		 cell = row.createCell(1);
		 cell.setCellValue("Yes");
		 
		 cell = row.createCell(2);
		 cell.setCellValue("Yes");
		 
		 cell = row.createCell(3);
		 cell.setCellValue("Yes");
		 
		 cell = row.createCell(4);
		 cell.setCellValue("Yes");
		 
		 cell = row.createCell(5);
		 cell.setCellValue("Yes");
		
		 
		 row = workSheet.createRow(3);
		 cell = row.createCell(0);
		 cell.setCellValue("Healthcare Program");
		 
		 cell = row.createCell(1);
		 cell.setCellValue("Medicare");
		 
		 cell = row.createCell(2);
		 cell.setCellValue("Medicare");
		 
		 cell = row.createCell(3);
		 cell.setCellValue("Medicare");
		 
		 cell = row.createCell(4);
		 cell.setCellValue("Medicare");
		 
		 cell = row.createCell(5);
		 cell.setCellValue("Medicare");
		
		
		 row = workSheet.createRow(4);
		 cell = row.createCell(0);
		 cell.setCellValue("Visit Date");
		
		 cell = row.createCell(1);
		 cell.setCellValue("17/01/2023");	
		 	
	
		 cell = row.createCell(2);
		 cell.setCellValue("17/01/2023");
		 
		 cell = row.createCell(3);
		 cell.setCellValue("18/01/2023");
		 
		 cell = row.createCell(4);
		 cell.setCellValue("19/01/2023");
		 
		 cell = row.createCell(5);
		 cell.setCellValue("02/02/2023");
		
		 row = workSheet.createRow(5);
		 cell = row.createCell(0);
		 cell.setCellValue("Comment");
		
		 cell = row.createCell(1);
		 cell.setCellValue("Dental Care");
		 
		 cell = row.createCell(2);
		 cell.setCellValue("Regular Check Up");
		 
		 cell = row.createCell(3);
		 cell.setCellValue("ENT Care");
		 
		 cell = row.createCell(4);
		 cell.setCellValue("Dermatology");
		 
		 cell = row.createCell(5);
		 cell.setCellValue("Ophthalmology");
		 
		
		FileOutputStream fos = new FileOutputStream(".\\TestDataFile\\CheckingAppointment.xlsx");
		workBook.write(fos);
		fos.flush();
	    workBook.close();

	}
}
