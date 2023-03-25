package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JsExecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username= driver.findElement(By.id("txtUsername"));

        username.sendKeys("Admin");

        // to highlight the username box
        // 1. declare instance
        JavascriptExecutor js= (JavascriptExecutor) driver;

        // 2. execute script
        // go to google and type javascript executor draw commands
        //arguments[0].style.border='3px solid blue' helps you to draw box that you specify
        js.executeScript("arguments[0].style.border='3px solid blue'",username);//  arguments[0].style.border='10px dotted pink' this is fixed code when you forgot just go to google it

        // find the WebElement of LoginButton
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        // click on the login button by JsExecutor
        // go to google and type javascript executor click commands
        js.executeScript("arguments[0].click();",loginBtn);

        // go to another website as amazon which has space to scroll down
        driver.navigate().to("https://www.amazon.com/");

        // scroll down the page by js
        js.executeScript("window.scrollBy(0,4000)");// go to google ant type javascript executor scroll down commands to find this path

    }
}
