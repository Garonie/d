package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CadastroUsuarioPage {
	
	
	//Construtor
	public CadastroUsuarioPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Elementos
	@FindBy(xpath = "//a[@class='login']")
	public WebElement botaoSignIn;
	
	@FindBy(id = "email_create")
	public WebElement campoCriarEmail;
	
	@FindBy(id = "SubmitCreate")
	public WebElement botaoCriarConta;
	
	@FindBy(id = "id_gender1")
	public WebElement caixaGeneroM;
	
	@FindBy(id = "customer_firstname")
	public WebElement campoPrimeiroNome;
	
	@FindBy(id = "customer_lastname")
	public WebElement campoSegundoNome;
	
	@FindBy(id = "passwd")
	public WebElement campoSenha;
	
	@FindBy(xpath = "//*[@id=\"days\"]")
	public WebElement caixaDia;
	
	@FindBy(xpath = "//*[@id=\"months\"]")
	public WebElement caixaMes;
	
	@FindBy(xpath = "//*[@id=\"years\"]")
	public WebElement caixaAno;
	
	@FindBy(id = "firstname")
	public WebElement caixaPrimeiroNomeEmpresa;
	
	@FindBy(id = "lastname")
	public WebElement caixaSegundoNomeEmpresa;
	
	@FindBy(id = "address1")
	public WebElement campoEndereco;
	
	@FindBy(id = "city")
	public WebElement campoCidade;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/ol/li")
	public WebElement mensagemCepInvalido;
	
	
	
	@FindBy(xpath = "//*[@id=\"id_state\"]")
	public WebElement caixaSelecionarEstado;
	
	@FindBy(id = "phone_mobile")
	public WebElement caixaTelefoneCelular;
	
	@FindBy(id = "alias")
	public WebElement campoEmailAlternativo;
	
	@FindBy(id = "submitAccount")
	public WebElement botaoRegistro;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	public WebElement paginaMinhaConta;
	
	@FindBy(id = "postcode")
	public WebElement campoCep;
	
	@FindBy(id = "phone_mobile")
	public WebElement campoCelular;
	
	@FindBy(xpath = "//*[@id=\"create_account_error\"]/ol/li")
	public WebElement mensagemEmailInvalido;
	
	@FindBy(xpath = "//ol[contains(.,'registered')]")
	public WebElement mensagemUsuarioJaCadastrado;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div")
	public WebElement mensagemFaltaCampo;
	
	//Metodos
	public void  clicarNoBotaoSignin() {
		botaoSignIn.click();
	}
	public void preencherCampoEmail(String string) {
		campoCriarEmail.sendKeys(string);
	}
	public void clicarNoBotaoCriarConta() {
		botaoCriarConta.click();
	}
	public void marcarCaixaGenero() {
		caixaGeneroM.click();
	}
	public void preencherOCampoPrimeiroNome(String string) {
		campoPrimeiroNome.sendKeys(string);
	}
	public void preencherOCampoSegundoNome(String string) {
		campoSegundoNome.sendKeys(string);
	}
	public void preencherOCampoSenha(String string) {
		campoSenha.sendKeys(string);
	}
	public void selecionarDiaAniversario(String string) {
		Select selecao = new Select(caixaDia);
		selecao.selectByValue(string);
	}
	public void selecionarMesAniversario(String string) {
		Select selecao = new Select(caixaMes);
		selecao.selectByValue(string);
	}
	public void selecionarAnoAniversario(String string) {
		Select selecao = new Select(caixaAno);
		selecao.selectByValue(string);
	}
	public void preencherOCampoEndereco(String string) {
		campoEndereco.sendKeys(string);
	}
	public void preencherCampoCidade(String string) {
		campoCidade.sendKeys(string);
	}
	public void selecionarEstado(String string) {
		Select selecao = new Select(caixaSelecionarEstado);
		selecao.selectByVisibleText(string);
	}
	public void preencherCampoCep(String string) {
		campoCep.sendKeys(string);
	}
	public void preencherCelular(String string) {
		campoCelular.sendKeys(string);
	}
	public void preencherEmailAlternativo(String string) {
		campoEmailAlternativo.sendKeys(string);
	}
	public void clicarNoBotaoRegistro() {
		botaoRegistro.click();
	}

	
	
	//Validações
	
	public void validarCadastroUsuario() {
		assertTrue(paginaMinhaConta.isEnabled());
	}
	public void validarEmailInvalido() {
		assertTrue(mensagemEmailInvalido.isDisplayed());
	}
	public void validarUsuarioJaCadastrado() {
		assertTrue(mensagemUsuarioJaCadastrado.isDisplayed());
	}
	public void validarCadastroFaltandoCampos() {
		assertTrue(mensagemFaltaCampo.isDisplayed());
	}
	public void validarMensagemCepInvalido() {
		assertTrue(mensagemCepInvalido.isDisplayed());
	}

}
