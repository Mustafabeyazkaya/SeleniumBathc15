package Class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));

        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));

        password.sendKeys("test");

        //This is the Syntax of ScreenShot method
        TakesScreenshot ss= (TakesScreenshot) driver;

        File sourceFile=ss.getScreenshotAs(OutputType.FILE);// we choose the FILE because the screenshot that we want to take is FILE type

        FileUtils.copyFile(sourceFile,new File("C:/Users/mbeya/OneDrive/Desktop/SeleniumBatch15/src/ScreenShot/iou.png")); // to find this path
        // just click on the SeleniumBatch15 on left side of your intellij at Project section
        //than click on the Open In than find the path that you need to store your screenshot



    }
}
