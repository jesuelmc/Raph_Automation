package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
	public WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\src\\Web_Driver\\chromedriver.exe");					
		driver = new ChromeDriver();					  									
		driver.get(baseUrl);
	}
	@Test
	public void VerifyMessageErrorDisplay() {
		
	}
	@AfterTest
	public void quit() {
		driver.close();
	}
}
