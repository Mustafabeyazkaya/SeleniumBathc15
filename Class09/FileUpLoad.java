package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpLoad {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));

        // to upload a file to the website
        chooseFile.sendKeys("C:/Users/mbeya/OneDrive/Desktop/src/screen"); // if it is not working just add  something as".txt." end of the your path as "C:/Users/mbeya/OneDrive/Desktop/src/screen.txt
        // but this is depend on your file extention if it is txt put txt , if png put png , if zip put zip
    }
}
