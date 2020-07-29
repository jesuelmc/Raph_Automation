package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistroTest {
	String baseUrl ="http://devtisserv.duckdns.org/#/" ;
	public WebDriver driver;
	
	
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
	@Test
	public void VerifyThatNumbersNotAllowInFieldName() {
		
	}
	
	@AfterTest
	public void quit() {
		driver.close();
	}
}
