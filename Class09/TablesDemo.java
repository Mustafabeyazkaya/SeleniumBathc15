package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));

        username.sendKeys("Admin");

        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));

        password.sendKeys("Hum@nhrm123");

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        WebElement PIM=driver.findElement(By.xpath("//b[text()='PIM']"));

        //click on it
        PIM.click();

        boolean idFound=false; // create a flag

        while (!idFound) { // loop it till idFound get true
            // in order to find the desired id
            List<WebElement> columns=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            // in multiple pages example we need to get List of column in to while loop
            // because every page the DOM ger refresh and may not read the path
            // to avoid this we get List of columns into while loop to loop it as well

            for (int i = 0; i < columns.size(); i++) {
                String text = columns.get(i).getText();

                if (text.equalsIgnoreCase("48921A")) {

                    System.out.println("The index number of List is " + i);

                    System.out.println("The index number of table is " + (i + 1)); //+1 comes from indexing difference loop start index 0, table on website starts index 1

                    // to click on the particular checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();

                    idFound = true; // if condition is found reassign the variable as true
                    break;// and break the loop
                }
            }

            // click on the next page
            if (!idFound) {// loop it till !idFound get false
                WebElement nextBtton = driver.findElement(By.xpath("//a[text()='Next']"));

                nextBtton.click();
            }
        }
    }
}
