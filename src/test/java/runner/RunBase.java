package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RunBase {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver initDriver(String browser) {

        if (driver != null) {
            driver.quit();
        }

        switch (browser){
            case "chrome-ci":
                ChromeOptions option = new ChromeOptions();
                option.addArguments("--headless");
                driver = new ChromeDriver(option);
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                throw new IllegalArgumentException("O navegador EDGE ainda não é suportado");
            default:
                throw new IllegalArgumentException("Navegador não encontrado. Passe um navegador válido.");
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

}
