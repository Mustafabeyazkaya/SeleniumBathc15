package ExampleFromJava;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// import the jars first

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            driver.get("http://www.google.com");
            driver.findElement(By.id("q")).sendKeys("Java tutorials");
        }catch (NoSuchElementException nsee){
            System.out.println("Please check your locators");
        }finally {// the code inside of finally keyword always executed
            // it will close the website even we have 1 million of error
            driver.close();
        }// if you add finally keyword after catch block it will close your browser even there is an error with your code
        // but Main2 class we did not write try, catch, and finally keyword that's why the website wont close because before .close method there is an error which is not resolved to reach .close method


    }
}
