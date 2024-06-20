package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroEmail {
        static WebDriver driver;

        public CadastroEmail(WebDriver driver) {
            this.driver = driver;
        }

        public void preencherCampo() {


            WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
            botaoAvancar.click();

        }
}
