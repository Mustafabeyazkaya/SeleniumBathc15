package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webDriver is located
        //for mac user please do not use ".exe" with chromedriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // open the Website that you want
        driver.get("https://www.facebook.com/");

        // get the current url that is there in the browser
        String URL = driver.getCurrentUrl();
        // Alt+enter

        // print out the url
        System.out.println(URL);

        // get the title of the webpage
        String title=driver.getTitle();
        System.out.println("The Title of the page is "+title);

        // always add this before close code
        Thread.sleep(3000);
        // Alt+enter

        // close the browser
        driver.quit();
        //driver.close(); // the same thing
    }
}
