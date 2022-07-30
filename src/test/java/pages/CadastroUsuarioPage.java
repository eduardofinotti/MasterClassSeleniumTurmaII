package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunTests;

public class CadastroUsuarioPage extends RunTests {

    // elementos
    private By campoNome = By.id("user");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("password");
    private By botaoSalvarCadastro = By.id("btnRegister");

    // ações / funções / metodos
    public void preencherNome(String email) {
        getDriver().findElement(campoNome).sendKeys(email);
    }

    public void preencherEmail(String email) {
        getDriver().findElement(campoEmail).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        getDriver().findElement(campoSenha).sendKeys(senha);
    }

    public void clickSalvarCadastro() {
        getDriver().findElement(botaoSalvarCadastro).click();
    }

    public void checkCadastroSucesso() {
        String textoEsperado = "Cadastro realizado!";
        String textoTela = getDriver().findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Os textos não são iguais!", textoEsperado, textoTela);
    }


}
