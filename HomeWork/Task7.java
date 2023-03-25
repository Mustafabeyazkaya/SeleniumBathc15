package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");

        driver.findElement(By.xpath("//p[text()='Your content goes here.']")).clear();

        driver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("Hello World!");

        driver.switchTo().defaultContent();


    }
}
