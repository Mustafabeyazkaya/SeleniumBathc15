package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxiMize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // go to google
        driver.get("https://www.google.com/");

        // maximize the window
        driver.manage().window().maximize();

        // full screen
        driver.manage().window().fullscreen();

        // close
        driver.close();

    }
}
