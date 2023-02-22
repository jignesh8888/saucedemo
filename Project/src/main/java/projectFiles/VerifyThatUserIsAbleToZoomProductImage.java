package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyThatUserIsAbleToZoomProductImage {
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
