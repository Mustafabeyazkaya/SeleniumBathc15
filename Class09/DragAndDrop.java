package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);// we should switch the driver to the other frame to perform
        // because things are on the another page

        // get the element which you want to drag
        WebElement draggable=driver.findElement(By.id("draggable"));

        // get the dropable element

        WebElement dropable=driver.findElement(By.id("droppable"));

        //action class
        Actions actions=new Actions(driver);

        actions.dragAndDrop(draggable,dropable).perform();


    }
}
