package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserIsAbleToClickOnProduct {
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
		//click on product		
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		 // Verify that the user was logged in
	    String expectedUrl = "https://www.saucedemo.com/inventory-item.html?id=4";
	    String actualUrl = driver.getCurrentUrl();
	    if (actualUrl.equals(expectedUrl)) {
	      System.out.println("Test case 1: Login was successful! - Passed");
	    } else {
	      System.out.println("Test case 1: Login was not successful. - Failed");
	    }
	    // Close the browser
	    driver.quit();
		
		
	}

}
