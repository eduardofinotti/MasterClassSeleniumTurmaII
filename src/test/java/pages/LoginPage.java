package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunTests;
import support.SupportEnv;

public class LoginPage extends RunTests {

    // elementos
    private String URL = "";
    private By botaoAcessarLogin = By.className("fa-user");
    private By campoEmail = By.id("user");
    private By botaoCriarConta = By.id("createAccount");

    // ações / funções / metodos
    public void acessarAplicacao(){
        initDriver(System.getProperty("browser"));
        getDriver().get(SupportEnv.getEnv());
    }

    public void acessarTelaLogin(){
        getDriver().findElement(botaoAcessarLogin).click();
    }

    public void preencherEmail(String email) {
        getDriver().findElement(campoEmail).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        getDriver().findElement(By.id("password")).sendKeys(senha);
    }

    public void clickLogin() {
        getDriver().findElement(By.id("btnLogin")).click();
    }

    public void checkLoginSucesso() {
        String textoEsperado = "Login realizado";
        String textoTela = getDriver().findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Os textos não são iguais!", textoEsperado, textoTela);
    }

    public void checkErrorLogin(String mensagem){
        String mensagemTela = getDriver().findElement(By.className("invalid_input")).getText();
        Assert.assertEquals(mensagem, mensagemTela);
    }

    public void acessarCadastroUsuario(){
        getDriver().findElement(botaoCriarConta).click();
    }

}
