package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get(" https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startBttn=driver.findElement(By.xpath("//button"));
        startBttn.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@id='finish']")).click();

        String text=driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
        System.out.println(text);
        boolean displayedHello=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
        System.out.println(displayedHello);


    }
}
