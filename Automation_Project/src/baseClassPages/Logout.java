package baseClassPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	WebDriver driver;
	
	By homePage = By.linkText("Go to Homepage");
	By menu = By.id("menu-toggle");
	By logOut = By.linkText("Logout");
	
	 // invoking webdriver
	public Logout(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void logoutPage() {
		
		
		// Clicking on the go to home page
		driver.findElement(homePage).click();
		
		// Clicking on the menu
		driver.findElement(menu).click();
		
		//Clicking on the logout option
		driver.findElement(logOut).click();
	}

}
