package mainTest;


import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClassPages.BookingAppointment;
import baseClassPages.History;

import baseClassPages.Login;
import baseClassPages.Logout;
import baseClassPages.ExtentReport;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass  {

	public WebDriver driver;
	String browser = "Chrome";

	Login login;

	BookingAppointment ba;
	History his;
	Logout log;
	ExtentReport extreprt;

	
	
	  @BeforeMethod 
	  public void SetUp() {
		  
		  // Choosing the browser
			if (browser.equalsIgnoreCase("Chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}

			else if (browser.equals("msedge")) {

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}

			else {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			}

			//Opening the URL
			driver.get("https://katalon-demo-cura.herokuapp.com");
			
			//Maximizing the window
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  }
	  
	
		@Test (priority = 1, dataProvider = "getData")	
		public void LoginTest (String userName, String paswrd) {
			
		  login = new Login(driver); 
		  login.TestingLogin(userName, paswrd);
		  login.VerifyPage();
		  Assert.assertTrue(true);		 
		  extreprt = new ExtentReport();
		  extreprt.ForLogin();
	  
	  }
	 
		 @DataProvider (name = "getData")
			
			public Object[][] LoginData() {
				
				Object[][] ob = new Object[2][2];
				
				ob[0][0] = "Nikhila";
				ob[0][1] = "Malu";
				ob[1][0] = "John Doe";
				ob[1][1] = "ThisIsNotAPassword";
				
				return ob;
				
		 }
	
			
	
	 @Test (priority = 2, dataProvider = "testData")  
	
	  public void AppointmentDta(String date, String comment, String confirmation) throws IOException {
	  
		 login = new Login(driver); 
		 login.loginPage();
	     ba = new BookingAppointment(driver); 
	     ba.Booking(date, comment, confirmation);
	     
	     extreprt = new ExtentReport();
		 extreprt.ForBookAppointment();
	  
	  
	  }
	 
	 
	 @DataProvider(name = "testData")

		public Object[][] BookingData() {

			Object[][] ob = new Object[5][3];
			ob[0][0] = "17/01/2023";
			ob[0][1] = "Dental Care";
			ob[0][2] = "Appointment successfully booked on 17/01/2023 for Dental care";
			ob[1][0] = "17/01/2023";
			ob[1][1] = "Regular Check Up";
			ob[1][2] = "Appointment successfully booked on 17/01/2023 for Regular Check up";
			ob[2][0] = "18/01/2023";
			ob[2][1] = "ENT Care";
			ob[2][2] = "Appointment successfully booked on 18/01/2023 for ENT Care";
			ob[3][0] = "19/01/2023";
			ob[3][1] = "Dermatology";
			ob[3][2] = "Appointment successfully booked on 19/01/2023 for Dermatology";
			ob[4][0] = "02/02/2023";
			ob[4][1] = "Ophthalmology";
			ob[4][2] = "Appointment successfully booked on 02/02/2023 for Ophthalmology";

			return ob;

		}

	  
		
	  @AfterMethod 
	  public void tearDown() {
	  
	  driver.quit();
	  
	  }
	 

}
