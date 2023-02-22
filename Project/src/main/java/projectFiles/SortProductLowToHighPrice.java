package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortProductLowToHighPrice {
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
		// find dropdown menu and click on it
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
		// find option low to high
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
		// Verify that product are sorted according to price (low to high)
			    String expectedUrl = "https://www.saucedemo.com/inventory.html";
			    String actualUrl = driver.getCurrentUrl();
			    if (actualUrl.equals(expectedUrl)) {
			      System.out.println("Product are sorted (low to high)");
			    } else {
			      System.out.println("Product are not sorted (low to high)");
			    }
			    // Close the browser
			    driver.quit();		

	}

}
