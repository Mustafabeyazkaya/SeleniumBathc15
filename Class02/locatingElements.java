package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        // tell your project where the webdriver is located
        //for mac user please do not use ".exe" with chromedriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // open facebook.com
        driver.navigate().to("https://www.facebook.com/");
        // send the locator to username
        driver.findElement(By.id("email")).sendKeys("Mustafa");
        // send the locator to password
        driver.findElement(By.name("pass")).sendKeys("abracadabra");
        // click on the button create New Account
        driver.findElement(By.linkText("Create new account")).click();
        // click on forgotten password
        driver.findElement(By.partialLinkText("password?")).click();
        // close the browser

        driver.quit();

    }
}
