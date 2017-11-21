package steps;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTests {

    @Test
    public void goToURL() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com.br");
        driver.quit();
    }

}
