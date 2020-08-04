package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Construtor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Elementos
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement campoEmail;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	public WebElement campoSenha;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	public WebElement botaoSignin;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	public WebElement telaMinhaConta;
	
	//Metodos
	
	public void preencherCampoEmail(String string) {
		campoEmail.sendKeys(string);
	}
	public void preencherCampoSenha(String string) {
		campoSenha.sendKeys(string);
	}
	public void clicarNoBotaoSignin() {
		botaoSignin.click();
	}
	
	
	//Validacoes
	public void validarTelaLogada() {
		assertTrue(telaMinhaConta.isDisplayed());
	}
	
	

}
