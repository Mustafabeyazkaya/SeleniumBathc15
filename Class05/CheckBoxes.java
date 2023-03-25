package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        //        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        // solving by Regular Loop
        for (int i = 0; i < checkBoxes.size(); i++) {

            String value=checkBoxes.get(i).getAttribute("value");
            // check if this is the desired one
            // if yes click on it
            // if not continue to iterate
            if (value.equalsIgnoreCase("Option-2")){
                checkBoxes.get(i).click();
            }
        }


        // solving by Enhanced Loop
    /*   for (WebElement checkBox:checkBoxes) {
          String value=checkBox.getAttribute("value");
            if (value.equalsIgnoreCase("Options-2")){
            checkBox.click();
          }
    }*/





    }
}
