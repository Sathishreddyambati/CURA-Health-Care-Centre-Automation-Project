package baseClassPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class History  {
	
	WebDriver driver;
	
	  By homePage = By.linkText("Go to Homepage"); 
	  By menu = By.id("menu-toggle");
	  By history = By.linkText("History");
      By screenshot = By.xpath("//div[@class=' col-sm-offset-2 col-sm-8']");


	  // invoking webdriver
	public History(WebDriver driver) {
			this.driver = driver;
		}


	
	  public void CheckingHistory()    {
	  
		  
	//clicking on the go to home page
	  driver.findElement(homePage).click();
	  
	  //Clicking on the menu in the home page
	  driver.findElement(menu).click();
	  
	  //Clicking on the history option from the menu
	  driver.findElement(history).click();
	  
	  }
	 
	  
	  public void Screenshot() throws IOException {
	
		  //Taking screenshot of the history page
	   //TakesScreenshot ts = (TakesScreenshot) driver;
	   WebElement AppointmentHistory = driver.findElement(screenshot);
	   File src = AppointmentHistory.getScreenshotAs(OutputType.FILE);
	   File trg = new File(".\\Screenshots\\History.png");
	   FileUtils.copyFile(src, trg);
	   
		
		
	  
		
		
	}

}
