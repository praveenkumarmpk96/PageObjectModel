package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjectUsingPF;
import pageObjects.LoginPageObjects;

public class LoginTestCaseUsingPF {

	@Test
	public void logincheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjectUsingPF.class);
		
		 LoginPageObjectUsingPF.username.sendKeys("Admin");
         LoginPageObjectUsingPF.password.sendKeys("admin123");
         LoginPageObjectUsingPF.loginbtn.click();
}
}
