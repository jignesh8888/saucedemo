package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationOfMenuTabs {
	public static void main(String[] args) {
		//configure the browser deriver
		WebDriverManager.chromedriver().setup();
		//open the browser
		WebDriver driver = new ChromeDriver();
		//open the url application
		driver.get("https://www.saucedemo.com/");
		//enter the username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");		
		//enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//clock on login
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		// find menu button and click on it
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		/*
		 * 1. find All Item button and click on it
		 */
		driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
		// Verification
	    String expectedUrl = "https://www.saucedemo.com/inventory.html";
	    String actualUrl = driver.getCurrentUrl();
		  if (actualUrl.equals(expectedUrl)) {
			   System.out.println("All Item Button Is not Working");
		  } else {
			  System.out.println("All Item Button Is Working");
			    }
		  // Close the browser
			driver.quit();
	}

}
