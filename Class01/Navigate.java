package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        // connect to webDriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // initate the instance of webDriver\
        WebDriver driver=new ChromeDriver();

        // open google.com
        driver.get("https://www.google.com/");
        Thread.sleep(2000);// to see website that you want to test at least 2 second before it goes forward to next website

        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);// to see website that you want to test at least 2 second before it goes forward to next website

        // go back
        driver.navigate().back();
        Thread.sleep(2000);// to see website that you want to test at least 2 second before it goes forward to next website

        //Difference between driver.get and driver.navigate:
        //  With navigate you can use driver.navigate().back(); command as well.
        // .navigate() can move back,forward and refresh
        // .get() can not move back,forward,refresh
        // .get() will wait until the whole webPage has loaded which is bad
        // .navigate() does not wait until whole webPage has loaded which is good


        // go to facebook again
        driver.navigate().forward();
        Thread.sleep(2000);

        // refresh tha current page
        driver.navigate().refresh();

        driver.close();
        //Difference between driver.close() and driver.quit()
        // .close() will close the current tab only
        // .quit() will close the whole browser


    }
}
