package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");


        WebElement checkBox=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean checkBoxSelect=checkBox.isSelected();
        System.out.println(checkBoxSelect);

        if (!checkBoxSelect){
            checkBox.click();
        }
        checkBoxSelect= checkBox.isSelected();
        System.out.println(checkBoxSelect);
    }
}
