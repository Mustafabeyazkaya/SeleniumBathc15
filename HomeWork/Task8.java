package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task8 {
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
        PIM.click();

        List<WebElement>columns=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i < columns.size(); i++) {
           String text= columns.get(i).getText();
           if (text.equalsIgnoreCase("52307A")){
               System.out.println("The index number of List is "+i);
               System.out.println("The index number of table is "+(i+1));

               driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
           }
        }

    }
}
