package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyThatUserIsAbleToRemoveProductFromCart {
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
				

		 // add a product to the cart
			    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
			    
		// navigate to the cart page
		  driver.findElement(By.className("shopping_cart_link")).click();
			       
		// remove the product from the cart
		  driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
		    	    
		 // verify that the product was added to the cart
		 WebElement cartBadge = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
			  if (cartBadge.getText().equals("")) {
			    System.out.println("Product is Removed Succesfully");
			  } else {
			    System.out.println("Product not removed succesfully");
			  }
			  driver.quit();

			    


	}

}
