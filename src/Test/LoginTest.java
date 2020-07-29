package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest {
	String baseUrl = "http://devtisserv.duckdns.org/#/";
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
		HomePage hPage = new HomePage(driver);
		LoginPage lPage = hPage.ini();
		lPage.llenarCampos("postulante", "12345678");
		lPage.ingresar();
	}
	@AfterTest
	public void quit() {
		//driver.close();
	}
}
