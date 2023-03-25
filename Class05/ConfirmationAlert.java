package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        //click on the button for simple prompt alert
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

        //use switchTo
        // create a Alert class object
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);

        // accept the pop-up
        alert.accept();

        // click on the PROMPT ALERT button
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

        //switch the focus to alert
        alert.sendKeys("abracadabra");
        Thread.sleep(2000);
        // accept it
        alert.accept();

    }
}
