package java;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class createNewUser {

    private FirefoxDriver driver;

    @Before
    public void preTest() {
        driver = new FirefoxDriver();

        System.setProperty("webdriver.gecko.driver", "/Users/Panda/Downloads/chromedriver");

        driver.get("http://localhost:8080/usuarios/new");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    @Test
    public void validationMsgError() {

        WebElement login = driver.findElement(By.id("btnSalvar"));

        login.click();

        assert(driver.getPageSource().contains("Nome obrigatorio!"));
        assert(driver.getPageSource().contains("E-mail obrigatorio!"));
    }

    @Test
    public void ValidationMsgError2() {

        WebElement email = driver.findElement(By.name("usuario.email"));

        email.sendKeys("axavier@empresa.com.br");
        email.submit();

        assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));

        }

    @After
    public void closeBroweserAfterTest() {
        driver.close();
    }
}



