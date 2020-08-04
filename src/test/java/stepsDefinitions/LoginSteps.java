package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage lp = new LoginPage();
	
	@Quando("preencher o campo email com {string}")
	public void preencherOCampoEmailCom(String string) {
		lp.preencherCampoEmail(string);
	}

	@Quando("preencher o campo senha com {string}")
	public void preencherOCampoSenhaCom(String string) {
		lp.preencherCampoSenha(string);
	}
	

	@Entao("o sistema mostra o usuario logado")
	public void oSistemaMostraOUsuarioLogado() {
		lp.validarTelaLogada();
	}

	@E("^clicar no botao signin$")
	public void clicarNoBotaoSignin() throws Throwable {
		lp.clicarNoBotaoSignin();
	}

}
