package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroUsuarioPage;
import pages.LoginPage;
import runner.RunTests;

public class CadastroUsuarioSteps extends RunTests {

    LoginPage loginPage = new LoginPage();
    CadastroUsuarioPage cadastroUsuarioPage = new CadastroUsuarioPage();

    @Dado("^que estou no cadastro de usuarios$")
    public void acessaCadastroUsuarios() {
        loginPage.acessarAplicacao();
        loginPage.acessarTelaLogin();
        loginPage.acessarCadastroUsuario();
    }

    @Dado("^preencho todos os campos obrigatórios$")
    public void preencho_todos_os_campos_obrigatórios() {
        cadastroUsuarioPage.preencherNome("Eduardo Finotti");
        cadastroUsuarioPage.preencherEmail("finotti@qazando.com.br");
        cadastroUsuarioPage.preencherSenha("123456");
    }

    @Quando("^clico em cadastrar usuário$")
    public void clico_em_cadastrar_usuário() {
        cadastroUsuarioPage.clickSalvarCadastro();
    }

    @Então("^vejo mensagem de cadsastro com sucesso$")
    public void vejo_mensagem_de_cadsastro_com_sucesso() {
        cadastroUsuarioPage.checkCadastroSucesso();
    }

}
