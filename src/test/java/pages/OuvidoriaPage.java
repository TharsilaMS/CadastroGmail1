package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class OuvidoriaPage {
   static WebDriver driver;

    public OuvidoriaPage(WebDriver driver) {
        this.driver = driver;
        }
        public void preencherNome(){
            WebElement nome = driver.findElement(By.id("form-field-nome"));
            nome.sendKeys("Alice");

            WebElement email = driver.findElement(By.id("form-field-email"));
            email.sendKeys("alice@gmail.com");

            WebElement telefone = driver.findElement(By.id("form-field-telefone"));
            telefone.sendKeys("2798991-0019");

            WebElement cpf = driver.findElement(By.id("form-field-cpf"));
            cpf.sendKeys("068.078.116-16");

            WebElement cidade = driver.findElement(By.id("form-field-cidade"));
            cidade.sendKeys("Porto Alegre");

            WebElement solicitacao = driver.findElement(By.id("form-field-solicitacao"));
            solicitacao.sendKeys("Elogio");

            WebElement mensagem = driver.findElement(By.id("form-field-mensagem"));
            mensagem.sendKeys("Minha mensagem de feedback ou solicitação aqui.");

            WebElement botaoEnviar = driver.findElement(By.xpath("//span[text()='Pronto, quero enviar a mensagem']"));
            botaoEnviar.click();

        }

    }
