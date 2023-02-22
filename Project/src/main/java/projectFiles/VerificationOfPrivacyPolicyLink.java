package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationOfPrivacyPolicyLink {
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
		// find privacy policy link at bottom and click
		driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/div")).click();
		 // Verify that the user is now on the Privacy page
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/privacy_policy")) {
            System.out.println("User is on Privacy page.");
        } else {
            System.out.println("User is not on Privacy page.");
        }

        // Close the browser
        driver.quit();
		
				
	}
	
	}


