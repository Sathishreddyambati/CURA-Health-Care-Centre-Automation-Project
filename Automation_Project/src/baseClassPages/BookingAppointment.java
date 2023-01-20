package baseClassPages;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;


public class BookingAppointment {

	 WebDriver driver;

     WritingDataIntoExcel wai;
	 History his;
	 Logout log;

	 XSSFRow row;
	 XSSFCell cell;

	By facility = By.id("combo_facility");
	By chk = By.id("chk_hospotal_readmission");
	By healthPrgm = By.id("radio_program_medicaid");
	By dte = By.id("txt_visit_date");
	By cmt = By.id("txt_comment");
	By submit = By.xpath("//*[text()='Book Appointment']");
	By homePage = By.linkText("Go to Homepage");

	// invoking webdriver
      
	   public BookingAppointment(WebDriver driver) {
		   
		   this.driver = driver;
		   
	   }
	
	 
	
	public void Booking(String date, String comment, String confirmation) throws IOException {

		// Selecting the facility
		WebElement drop = driver.findElement(facility);
		drop.click();
		Select se = new Select(drop);
		se.selectByValue("Hongkong CURA Healthcare Center");

		// Selecting the hospital re-admission checkBox
		WebElement checkBox = driver.findElement(chk);
		checkBox.click();

		// Selecting the HealthCare program radio button
		driver.findElement(healthPrgm).click();

		// Entering the date
		driver.findElement(dte).sendKeys(date);

		// Entering the comment
		driver.findElement(cmt).sendKeys(comment);

		// Clicking on the book appointment button
		driver.findElement(submit).click();
		
		System.out.println(confirmation);
		
		
		   //Getting the last login page
		  if(driver.getPageSource().contains("Ophthalmology")) {
			  
			  // writing data into the excel file
			   wai = new WritingDataIntoExcel();
			   wai.WritingData();
			   System.out.println("More details about the appointment is available on the Excel file");
		     
			   //checking history
			  his = new History(driver); 
			  his.CheckingHistory(); 
			  
			  //taking screenshots
			  his.Screenshot();
			  
			  //Performing logout
			  log = new Logout(driver); 
			  log.logoutPage();
			  
		  }
		  
		  else {
		  
			//Performing logout
		  log = new Logout(driver); 
		  log.logoutPage(); 
		  driver.close();
		 
		  }
		 

	}
	

	
}

