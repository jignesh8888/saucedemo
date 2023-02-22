package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyThatProductAreSortedAccordingToPrice {
	public static void main(String[] args) {
		//configure the browser deriver
		WebDriverManager.chromedriver().setup();
		//open the browser
		WebDriver driver = new ChromeDriver();
		//open the url application
		driver.get("https://www.saucedemo.com/");
		//enter the username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");			//enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//clock on login
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		// find dropdown menu and click on it
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
		// find option high to low
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]")).click();
		// Verify that product are sorted according to price (high to low)
	    String expectedUrl = "https://www.saucedemo.com/inventory.html";
	    String actualUrl = driver.getCurrentUrl();
	    if (actualUrl.equals(expectedUrl)) {
	      System.out.println("Product are sorted (high to low)");
	    } else {
	      System.out.println("Product are not sorted (high to low)");
	    }
	    // Close the browser
	    driver.quit();		
				
	}

}
