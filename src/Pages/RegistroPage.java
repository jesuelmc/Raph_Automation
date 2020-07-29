package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroPage {
	WebDriver driver;
	
	//Objetos o partes de la pagina
		@FindBy(xpath = "//a[@id=\"pantel_docente\"]")
		private WebElement Registro;
		
	public RegistroPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
