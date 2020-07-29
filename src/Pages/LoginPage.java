package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name=\"userName\"]")
	private WebElement username;
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;
	@FindBy(xpath = "/html/body/app-root/ion-app/ion-router-outlet/app-login/ion-content/div/form/div[7]/ion-button[1]")
	private WebElement ingresar;
	@FindBy(xpath = "/html/body/app-root/ion-app/ion-router-outlet/app-login/ion-content/div/form/div[7]/ion-button[2]")
	private WebElement cancelar;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void llenarCampos(String un, String pw) {
		username.clear();
		password.clear();
		username.sendKeys(un);
		password.sendKeys(pw);
	}
	public void ingresar() {
		ingresar.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
