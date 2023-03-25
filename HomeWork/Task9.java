package HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement button=driver.findElement(By.xpath("//button[@onclick='setTimeout(alertme,5000);alertcount();']"));

        button.click();

        WebDriverWait wait=new WebDriverWait(driver,6);

        Alert alert=driver.switchTo().alert();

        wait.until(ExpectedConditions.alertIsPresent());

        alert.accept();




    }
}
