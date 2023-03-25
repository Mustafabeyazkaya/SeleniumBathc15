package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        //get the dropdown
        WebElement multiDropDown=driver.findElement(By.xpath("//select[@id='multi-select']"));

        //create a select class object
        Select select=new Select(multiDropDown);

        //Select by Value
        select.selectByValue("New Jersey");

        //Select By Visible Text
        select.selectByVisibleText("Ohio");
        Thread.sleep(2000);

        //When it comes to multiSelect Drop down, we can also deselect
        //deSelectByValue
        select.deselectByValue("New Jersey");

        //deSelectByVisibleText
        select.deselectByVisibleText("Ohio");

        System.out.println("The Drop Down is multiple? "+select.isMultiple());
    }
}
