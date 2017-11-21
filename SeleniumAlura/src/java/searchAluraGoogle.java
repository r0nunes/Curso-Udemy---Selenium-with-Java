import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchAluraGoogle {

    @Test
    public static void main(String[] args) {
        // abre firefox
        System.setProperty("webdriver.gecko.driver", "/Users/Panda/Downloads/chromedriver");
        WebDriver driver = new FirefoxDriver();

        // acessa o site do google
        driver.get("http://www.google.com.br/");

        // digita no campo com nome "q" do google
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("Caelum");

        // submete o form
        campoDeTexto.submit();

        driver.quit();

    }
}