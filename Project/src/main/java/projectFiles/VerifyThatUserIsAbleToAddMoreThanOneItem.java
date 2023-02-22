package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyThatUserIsAbleToAddMoreThanOneItem {
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
			    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
			   driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
			    
			    // verify that the product was added to the cart
			    WebElement cartBadge = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
			    if (cartBadge.getText().equals("3")) {
			      System.out.println("More Products are added to cart successfully.");
			    } else {
			      System.out.println("Product not added to cart.");
			    }

			    
	}

}
