package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        WebElement enterMessage=driver.findElement(By.xpath("//input[@class='form-control']"));

        enterMessage.sendKeys("Fenerbahce");

        WebElement showMessage=driver.findElement(By.xpath("//button[(text()='Show Message')]"));

        showMessage.click();

        WebElement enterA=driver.findElement(By.xpath("//input[@id='sum1']"));

        enterA.sendKeys("10");

        WebElement enterB= driver.findElement(By.xpath("//input[@id='sum2']"));

        enterB.sendKeys("5");

        WebElement getTotal=driver.findElement(By.xpath("//button[contains(@onclick,'return total()')]"));

        getTotal.click();

        String a=enterMessage.getText();
        String b=showMessage.getText();
        String c=enterA.getText();
        String d=enterB.getText();
        String e=getTotal.getText();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);



    }
}
