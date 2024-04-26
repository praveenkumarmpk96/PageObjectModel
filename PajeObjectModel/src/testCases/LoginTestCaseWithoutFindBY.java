package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjectUsingPF;

public class LoginTestCaseWithoutFindBY {
	
	public static WebElement username;
	public static WebElement password;
//	public static WebElement //*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button;

	@Test
	public void logincheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginTestCaseWithoutFindBY.class);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		
		

}
}
