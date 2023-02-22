package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationOfProductInfo {
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
	    // verify the product information
	    WebElement productName = driver.findElement(By.className("inventory_item_name"));
	    WebElement category = driver.findElement(By.className("inventory_item_desc"));
	    WebElement price = driver.findElement(By.className("inventory_item_price"));
	    WebElement description = driver.findElement(By.className("inventory_item_desc"));
	    if (productName.isDisplayed() && category.isDisplayed() && price.isDisplayed() && description.isDisplayed()) {
		     System.out.println("Product information verification passed.");
	    } else {
		     System.out.println("Product information verification failed.");
		   }
		  // close the browser
		  driver.quit();
	}
	
	

}
