package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Mustafa");
        driver.findElement(By.id("customer.lastName")).sendKeys("Beyazkaya");
        driver.findElement(By.id("customer.address.street")).sendKeys("Rodeway");
        driver.findElement(By.id("customer.address.city")).sendKeys("Williamsburg");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("23188");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("12345678");
        driver.findElement(By.id("customer.ssn")).sendKeys("456789");
        driver.findElement(By.id("customer.username")).sendKeys("beyazkaya8");
        driver.findElement(By.id("customer.password")).sendKeys("mustafa123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("mustafa123");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
