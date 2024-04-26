package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {
    
	@Test
	public void logincheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		
         LoginPageObjects.username(driver).sendKeys("Admin");
         LoginPageObjects.password(driver).sendKeys("admin123");
         LoginPageObjects.loginbutton(driver).click();
     
  

		/*
		 * WebElement username = driver.findElement(By.name("username"));
		 * username.sendKeys(uname);
		 * 
		 * WebElement password = driver.findElement(By.name("password"));
		 * password.sendKeys(pwd);
		 * 
		 * WebElement loginbutton = driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		 * loginbutton.click();
		 */
	}
}
