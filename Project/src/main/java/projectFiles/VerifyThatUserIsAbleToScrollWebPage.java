package projectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyThatUserIsAbleToScrollWebPage {
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
		 driver.close();
	}

}
