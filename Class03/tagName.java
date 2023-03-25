package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        //get all the links
        //we know that all links are in tag <a> which is also called anchor tag
        //lets use the locator By tagName for this purpose


        List<WebElement> tags=driver.findElements(By.tagName("a"));// this is list of webElement because we call multiple links
        // in order to print
        // we need to iterator

        for (WebElement tag:tags){
          String links=tag.getAttribute("href");
            System.out.println(links);

        }

    }
}
