package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.OuvidoriaPage;


public class OuvidoriaTest {
 static WebDriver driver;
static OuvidoriaPage ouvidoriaPage;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qi.edu.br/ouvidoria/");

        ouvidoriaPage = new OuvidoriaPage(driver);
        ouvidoriaPage.preencherNome();
    }

    @After
    public void tearDown() throws Exception {
    }
}