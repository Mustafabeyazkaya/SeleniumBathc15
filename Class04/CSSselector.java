package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

       //max the window
        driver.manage().window().maximize();

        // go to facebook.com
        driver.get("https://www.facebook.com/");

        // click on the button create account using CSS selector
        WebElement createNewBtn=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));

        // click on the button
        createNewBtn.click();

        //after click on some page that you will fill up you need to put sleep before
        // because it takes a little time to pop up the form screen and we need to respect it
        Thread.sleep(2000);

        // fill in the first name
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));

        //send your key to firstname box
        firstName.sendKeys("abracadabra");

    }
}
