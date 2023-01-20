package baseClassPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Login {
	
	WebDriver driver;
	
	
	By menu = By.id("menu-toggle");
	By login = By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a");
	By uName = By.id("txt-username");
	By password = By.id("txt-password");
	By loginBtn = By.id("btn-login");
    By fail = By.xpath("//*[text()='Login failed! Please ensure the username and password are valid.']");
    By verify = By.xpath("//h2");

   // invoking webdriver
	public Login(WebDriver driver) {

		this.driver = driver;
		
	}


	
	public void loginPage() {
		
		// Entering the login page through menu button
		driver.findElement(menu).click();
		driver.findElement(login).click();
		
		// Entering UserName
		driver.findElement(uName).sendKeys("John Doe");
				
		//Entering Password
		driver.findElement(password).sendKeys("ThisIsNotAPassword");
				
		// Click on the login button
		driver.findElement(loginBtn).click();
				
			}
	
	public void TestingLogin(String userName, String paswrd) {
		
		// Entering the login page through menu button
		driver.findElement(menu).click();
		driver.findElement(login).click();
		
		// Entering UserName
		driver.findElement(uName).sendKeys(userName);
		
		//Entering Password
		driver.findElement(password).sendKeys(paswrd);
		
		// Click on the login button
		driver.findElement(loginBtn).click();
		
	}
		
		public void VerifyPage() {
		
		// Verifying the user is navigate to the make appointment page
		if(driver.getPageSource().contains("Facility")) {
			System.out.println("Login Sucessfully");
			
			//Verifying the title of the page
			String ActualResult = "Make Appointment";
			String ExcpetedResult = driver.findElement(verify).getText();
			Assert.assertEquals(ActualResult, ExcpetedResult);
			
			}
		
		
		else {
			
			System.out.println("Invaild Credentials");
			System.out.println(driver.findElement(fail).getText());
			
			
		}
		
     }
	}
		 
	

		
      
		
		

