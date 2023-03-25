package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task10 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));

        button.click();

        WebElement text=driver.findElement(By.xpath("//h2[@id='h2']"));

        WebDriverWait wait=new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.titleIs(String.valueOf(text)));

        driver.close();

    }
}
