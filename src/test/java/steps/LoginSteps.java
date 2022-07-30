package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunTests;
import support.ScreenshotUtils;


public class LoginSteps extends RunTests {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void acessaTelaLogin() {
        loginPage.acessarAplicacao();
        loginPage.acessarTelaLogin();
    }

    @Dado("^preencho o e-mail \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preencho_o_e_mail_e_senha(String email, String senha) {
        loginPage.preencherEmail(email);
        loginPage.preencherSenha(senha);
    }

    @Quando("^clico no botão de login$")
    public void clico_no_botão_de_login() {
        loginPage.clickLogin();
    }

    @Então("^sou logado com sucesso$")
    public void sou_logado_com_sucesso() {
        loginPage.checkLoginSucesso();
    }

    @Então("^vejo mensagem \"([^\"]*)\"$")
    public void vejo_mensagem(String mensagem)  {
       loginPage.checkErrorLogin(mensagem);
    }

    @After
    public void takeScreenshot(Scenario scenario) {
        if(scenario.isFailed()){
            System.out.println("===========================");
            System.out.println("Teste com falha: " + scenario.getName());
            System.out.println("Status: " + scenario.getStatus());
            System.out.println("Tag: " + scenario.getSourceTagNames());
            System.out.println("===========================");
            ScreenshotUtils.addScreenshot(scenario);
        }
    }

}
