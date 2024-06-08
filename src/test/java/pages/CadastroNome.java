package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroNome {
    static WebDriver driver;

    public CadastroNome(WebDriver driver) {
        this.driver = driver;
    }
    public void preencherCampo(){
        WebElement nome = driver.findElement(By.id("firstName"));
   nome.sendKeys("Tharsila");

        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("Morais");

    }

}
