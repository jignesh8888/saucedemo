import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project {
	public static void main(String[] args) {
		//configure the browser deriver
		WebDriverManager.chromedriver().setup();
		//open the browser
		WebDriver driver = new ChromeDriver();
		//open the url application
		driver.get("https://onlinelearning.excelr.com/signin");
		//enter the username
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("khairnarjignesh2001@gmail.com");
		//enter password
		driver.findElement(By.id("password")).sendKeys("Jignesh@0818");
		//clock on login
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/div/div/div[3]/div/form/div[4]/button")).click();
		//driver.findElement(By.class("StyledIconBase-ea9ulj-0 bWRyML\")).click();
}

	}


