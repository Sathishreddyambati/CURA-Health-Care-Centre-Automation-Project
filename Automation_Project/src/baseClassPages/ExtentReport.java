package baseClassPages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	ExtentSparkReporter sparkReport;
	ExtentReports reports;
	ExtentTest test;
	
	
		public void ForLogin() {
			
			//Creating a html file for recording the reports of login class
			sparkReport = new ExtentSparkReporter(".\\test-output\\reports\\report.html");
			sparkReport.config().setDocumentTitle("Automation Testing Report");
			sparkReport.config().setReportName("CURA Healthcare Centre Automation Testing");
			
			reports = new ExtentReports();
			reports.attachReporter(sparkReport);
			
			reports.setSystemInfo("Host Name", "Local Host");
			reports.setSystemInfo("Tester", "Nikhila G Chandran");
			reports.setSystemInfo("Enviroment", "QA");
			reports.setSystemInfo("OS", "Windows");
		
		test = reports.createTest("Login Page", "To validate login page of CURA Healthcare Centre");
		
		reports.flush();
		
		}
		
		public void ForBookAppointment() {
			
			//Creating a html file for recording the reports of booking appointment class
			sparkReport = new ExtentSparkReporter(".\\test-output\\reports\\report1.html");
			sparkReport.config().setDocumentTitle("Automation Testing Report");
			sparkReport.config().setReportName("CURA Healthcare Centre Automation Testing");
			
			reports = new ExtentReports();
			reports.attachReporter(sparkReport);
			
			reports.setSystemInfo("Host Name", "Local Host");
			reports.setSystemInfo("Tester", "Nikhila G Chandran");
			reports.setSystemInfo("Enviroment", "QA");
			reports.setSystemInfo("OS", "Windows");
			
			test = reports.createTest("Booking Appointment", "To validat booking appointment page of CURA Healthcare Centre");
			
			reports.flush();
			
			}
		
		
	}


