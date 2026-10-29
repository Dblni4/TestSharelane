package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SignUpTest {

    @Test
    public void inputValidDataInSignUpForm() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=11111");

        driver.findElement(By.name("first_name")).sendKeys("Bulba");
        driver.findElement(By.name("last_name")).sendKeys("Zavr");
        driver.findElement(By.name("email")).sendKeys("Bulba@zavr.com");
        driver.findElement(By.name("password1")).sendKeys("Bulbazavr1");
        driver.findElement(By.name("password2")).sendKeys("Bulbazavr1");
        WebElement registerButton = driver.findElement(By.xpath("//input[@value='Register']"));
        registerButton.click();

        String text = driver.findElement(By.cssSelector(".confirmation_message")).getText();
        assertEquals(text, "Account is created!");

        driver.quit();
    }
}
