package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	//Objetos o partes de la pagina
	@FindBy(xpath = "/html/body/app-root/ion-app/ion-router-outlet/app-index/ion-header/ion-toolbar/ion-button[1]")
	private WebElement botonInicio;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public LoginPage ini() {
		botonInicio.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new LoginPage(driver);
	}
}
