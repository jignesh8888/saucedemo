package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRProject1 {
	WebDriver driver ;
	@BeforeTest
	public void startBrowser() {
		//configure the browser deriver
				WebDriverManager.chromedriver().setup();
				//open the browser
				 driver = new ChromeDriver();
				//open the url application
				driver.get("https://www.saucedemo.com/");
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		 // Close the browser 
	  //  driver.quit();

		
	}
	
	@Test(priority = 1)
	public void launchingWeb() {
		
				//enter the username
				WebElement username = driver.findElement(By.id("user-name"));
				username.sendKeys("standard_user");
				//enter password
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				//clock on login
				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			    // Verify that the user was logged in
			    String expectedUrl = "https://www.saucedemo.com/inventory.html";
			    String actualUrl = driver.getCurrentUrl();
			    if (actualUrl.equals(expectedUrl)) {
			      System.out.println("Test case 1: Login was successful! - Passed");
			    } else {
			      System.out.println("Test case 1: Login was not successful. - Failed");
			    }
	
			    
		
	}
	@Test(priority = 2)
	public void sortOfProductLowtoHigh() {
//		
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
					 
		
	}
	@Test(priority = 8)
	public void clickOnProduct() {
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
			    
	}
	@Test(priority = 16)
	public void clickOnMenuTab() {
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
	}
	@Test(priority = 5)
	public void privacypolicyLink() {
		// find privacy policy link at bottom and click
				driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/div")).click();
				 // Verify that the user is now on the Privacy page
		        String currentUrl = driver.getCurrentUrl();
		        if (currentUrl.contains("/privacy_policy")) {
		            System.out.println("User is on Privacy page.");
		        } else {
		            System.out.println("User is not on Privacy page.");
		        }

		        
	}
	@Test(priority = 6)
	public void productInfo() {
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
		  
	}
				
	
	@Test(priority = 7)
	public void termsOfServices() {	
		// find terms of services link at bottom and click
				driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/div")).click();
				 // Verify that the user is now on the Privacy page
				        String currentUrl = driver.getCurrentUrl();
				        if (currentUrl.contains("/terms_of_services")) {
				            System.out.println("User is on Terms of Services page.");
				        } else {
				            System.out.println("User is not on Terms of Services page.");
				        }

				
		
		
	}
	@Test(priority = 3)
	public void profuctSortingHighToLow() {
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
			   
	}
	@Test(priority = 9)
	public void addItemInCart() {
		// add a product to the cart
	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	    // verify that the product was added to the cart
	    WebElement cartBadge = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
	    if (cartBadge.getText().equals("1")) {
	      System.out.println("Product added to cart successfully.");
	    } else {
	      System.out.println("Product not added to cart.");
	    }

	  
		
	}
	@Test(priority = 10)
	public void addMoreThanOneItem() {
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
	@Test(priority = 11)
	public void facebook() {
		// Find the facebook icon at the bottom and click it
				WebElement facebook = driver.findElement(By.cssSelector("#page_wrapper > footer > ul > li.social_facebook > a"));
				facebook.click();
			
	}
	@Test(priority = 12)
	public void linkedIn() {

		// Find the LinkedIn icon at the bottom and click it
        WebElement linkedinIcon = driver.findElement(By.cssSelector("#page_wrapper > footer > ul > li.social_linkedin > a"));
        linkedinIcon.click();
      
	}
	@Test(priority = 13)
	public void twitter() {
		
		// Find the twitter icon at the bottom and click it
		WebElement twitter = driver.findElement(By.cssSelector("#page_wrapper > footer > ul > li.social_twitter > a"));
		twitter.click();

	}
	@Test(priority = 14)
	public void RemoveProduct() {

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
			
	}
	@Test(priority = 15)
	public void ScrollToBottom() {
		// Wait for the page to load
				try {
				    Thread.sleep(8000);
				 } catch (InterruptedException e) {
				    e.printStackTrace();
				  }
				 // Scroll down the page using JavaScript
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				 // close the browser
				
	}
	@Test(priority = 4)
	public void ViewAscendingItems() {
		// find dropdown menu and click on it
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
		// find option A to Z
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[1]")).click();
		// Verify that product are sorted according to aSCENDING ORDER
			    String expectedUrl = "https://www.saucedemo.com/inventory.html";
			    String actualUrl = driver.getCurrentUrl();
				  if (actualUrl.equals(expectedUrl)) {
					   System.out.println("Product are sorted (A to Z)");
				  } else {
					  System.out.println("Product are not sorted (A to Z)");
					    }
	
	}
	@Test(priority = 17)
	public void ViewdescendingItems() {
		// find dropdown menu and click on it
				driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
				// find option Z to A
				driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]")).click();
				// Verify that product are sorted according to Descending Order
					    String expectedUrl = "https://www.saucedemo.com/inventory.html";
					    String actualUrl = driver.getCurrentUrl();
						  if (actualUrl.equals(expectedUrl)) {
							   System.out.println("Product are sorted (Z to A)");
						  } else {
							  System.out.println("Product are not sorted (Z to A)");
							    }
			 
	}
	@Test(priority = 18)
	public void ZoomProductImage() {
		// click on 1st product
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		// Wait for the image to load
				try {
				    Thread.sleep(9000);
				 } catch (InterruptedException e) {
				    e.printStackTrace();
				  }
		// Verify that the image zooms in on mouse hover
        WebElement zoomedImage = driver.findElement(By.cssSelector("#inventory_item_container > div > div > div.inventory_details_img_container > img"));
        String zoomedImageSrc = zoomedImage.getAttribute("src");
        if (zoomedImageSrc.contains("800x")) {
            System.out.println("Image zoomed in successfully.");
        } else {
            System.out.println("Image did not zoom in.");
        }
	}

}
