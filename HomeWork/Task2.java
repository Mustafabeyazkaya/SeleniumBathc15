package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Mustafa");
        driver.findElement(By.name("lastname")).sendKeys("Beyazkaya");
        driver.findElement(By.name("reg_email__")).sendKeys("123456478");
        driver.findElement(By.id("password_step_input")).sendKeys("1234567");



        driver.findElement(By.id("month")).sendKeys("March");
        driver.findElement(By.name("birthday_day")).sendKeys("9");
        driver.findElement(By.id("birthday_year")).sendKeys("1998");
        driver.findElement(By.linkText("Male")).click();
        driver.findElement(By.className("Sign Up")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
