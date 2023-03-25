package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List< WebElement > elements=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement checkBoxes:elements) {
            String tags=checkBoxes.getAttribute("value");
            System.out.println(tags);
            if (tags.equalsIgnoreCase("Option-2")){
                checkBoxes.click();
            }
        }


    }
}
