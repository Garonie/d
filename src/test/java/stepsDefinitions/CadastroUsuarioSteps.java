package stepsDefinitions;

import java.util.Random;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroUsuarioPage;

public class CadastroUsuarioSteps {

	CadastroUsuarioPage cd = new CadastroUsuarioPage();

	@Quando("eu clicar no botao Sign in")
	public void euClicarNoBotaoSignIn() {
		cd.clicarNoBotaoSignin();
	}

	@Quando("preencher o campo do email com o {string}")
	public void preencherOCampoDoEmailComO(String string) {
		
		Random aleatorio = new Random();
		float email = aleatorio.nextFloat();
		
		cd.preencherCampoEmail("email: "+ email);
	}

	@Quando("clicar no botao criar conta")
	public void clicarNoBotaoCriarConta() {
		cd.clicarNoBotaoCriarConta();
	}

	@Quando("marcar a caixa title com mr")
	public void marcarACaixaTitleComMr() {
		cd.marcarCaixaGenero();
	}

	@Quando("preencher o campo primeiro nome com {string}")
	public void preencherOCampoPrimeiroNomeCom(String string) {
		cd.preencherOCampoPrimeiroNome(string);
	}

	@Quando("preencher o campo segundo nome com {string}")
	public void preencherOCampoSegundoNomeCom(String string) {
		cd.preencherOCampoSegundoNome(string);
	}

	@Quando("preencher o campo password com {string}")
	public void preencherOCampoPasswordCom(String string) {
		cd.preencherOCampoSenha(string);
	}

	@Quando("selecionar a dia do aniversario para {string}")
	public void selecionarADiaDoAniversarioPara(String string) {
		cd.selecionarDiaAniversario(string);
	}

	@Quando("selecionar o mes para {string}")
	public void selecionarOMesPara(String string) {
		cd.selecionarMesAniversario(string);
	}

	@Quando("selecionar o ano para {string}")
	public void selecionarOAnoPara(String string) {
		cd.selecionarAnoAniversario(string);
	}

	@Quando("prencher o campo endereco para {string}")
	public void prencherOCampoEnderecoPara(String string) {
		cd.preencherOCampoEndereco(string);
	}

	@Quando("preencher o campo cidade para {string}")
	public void preencherOCampoCidadePara(String string) {
		cd.preencherCampoCidade(string);
	}

	@Quando("selecionar o campo estado para {string}")
	public void selecionarOCampoEstadoPara(String string) {
		cd.selecionarEstado(string);
	}

	@Quando("preencher o campo cep com {string}")
	public void preencherOCampoCepCom(String string) {
		cd.preencherCampoCep(string);
	}
	
	@Quando("preencher o campo telefone celular com {string}")
	public void preencherOCampoTelefoneCelularCom(String string) {
		cd.preencherCelular(string);
	}

	@Quando("preencher o email alternativo com {string}")
	public void preencherOEmailAlternativoCom(String string) {
		cd.preencherEmailAlternativo(string);
	}

	@Quando("clicar no botao registrar")
	public void clicarNoBotaoRegistrar() {
		cd.clicarNoBotaoRegistro();
	}

	@Entao("o site mostra a tela minha conta")
	public void oSiteMostraATelaMinhaConta() {
		cd.validarCadastroUsuario();
	}

	@Entao("^o sistema mostra a mensagem email invalido$")
	public void oSistemaMostraAMensagemEmailInvalido() throws Throwable {
		cd.validarEmailInvalido();
	}

	@Entao("^o sistema mostra a mensagem usuario ja cadastrado$")
	public void oSistemaMostraAMensagemUsuarioJaCadastrado() throws Throwable {
		cd.validarUsuarioJaCadastrado();
	}

	@Entao("^o sistema mostra a mensagem falta preencher campos$")
	public void oSistemaMostraAMensagemFaltaPreencherCampos() throws Throwable {
		cd.validarCadastroFaltandoCampos();
	}

	@Entao("^o site mostra a mensagem de erro$")
	public void oSiteMostraAMensagemDeErro() throws Throwable {
		cd.validarMensagemCepInvalido();
	}

}
