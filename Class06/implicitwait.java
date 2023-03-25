package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitwait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //just put this usually first lines of your code as driver.manage().window().maximize();  not to worry about time
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// to put this makes your code keep working properly after the new page pop-up
        //for example if your page pop-up after 5 second it won't wait til 20 second, it will just keep implementing your keys

        //using Thread,sleep can get u fired, because you are wasting time

        // go to facebook.com
        driver.get("https://www.facebook.com/");

        // click on the crate new account
        driver.findElement(By.linkText("Create new account")).click();



        driver.findElement(By.name("firstname")).sendKeys("abracadabra");

    }
}
