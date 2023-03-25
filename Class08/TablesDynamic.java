package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDynamic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // go to syntaxtechs.com
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        //        enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        // task check the checkbox containing the product screensaver
        List<WebElement> columns=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        // ITERATE THROUGH EACH TO SEE OF OT CONTAINS SCREENSAVER
        for (int i = 0; i < columns.size(); i++) {
            String text=columns.get(i).getText();
            if (text.equalsIgnoreCase("Screensaver")){
            System.out.println(text);
                System.out.println("The screensaver is located at row number "+(i+2)); // we add +2 because in intellij index number shows 0 and 2
                // because loop starts from 0 index but table index on website start from 1 , first +1 comes from here
                // and another +1 comes from header that table has on website which intellij ignore
                // when we figured out on website, i realize that real index numbers are +2 to intellij index, that s why we add +2
                /*
                Basically, 3 steps, all separated?
                i(whatever is found in our if condition if set properly) +1(difference between loop starting index and table starting index) +1(from header) in this case...
                 */

                // to click the checkboxes which represent the screensaver
               WebElement checkbox= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]"));
               checkbox.click();
                System.out.println(checkbox.isSelected());
            }
        }

    }
}
