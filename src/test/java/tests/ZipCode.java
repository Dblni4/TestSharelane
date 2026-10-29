package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ZipCode {

    @Test
    public void chekZipCodeInputValidData() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("11111");
        WebElement continueButton = driver.findElement(By.xpath("//input[@value = 'Continue']"));
        continueButton.click();
        WebElement signUpForm = driver.findElement(By.className("yellow_bg"));

        assertTrue(signUpForm.isDisplayed());

        driver.quit();
    }
}