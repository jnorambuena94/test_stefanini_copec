import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class test_ripley {

    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jaime\\Desktop\\test_stefanini_copec\\Driver\\chromedriver_108.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://simple.ripley.cl/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//header[@id='ripley-sticky-header']/section/nav/ul/li[2]/div/div/a/div/div/div/strong")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("ws_username")).click();
        driver.findElement(By.name("ws_username")).sendKeys("18882545-1");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("test123.");
        driver.findElement(By.id("inicio-sesion-ripley")).click();
        //Validamos título de la página
        Assert.assertTrue(driver.getTitle().contains("Mejores Ofertas en Compras Online | Ripley.com"));
        driver.quit();
    }
}
