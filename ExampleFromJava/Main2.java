package ExampleFromJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Main2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// import the jars first

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.get("http://www.google.com");

            driver.findElement(By.id("q")).sendKeys("Java tutorials");

            driver.close();//we did not write try, catch, and finally keyword that's why the website wont close because before .close method there is an error which is not resolved to reach .close method


    }
}
