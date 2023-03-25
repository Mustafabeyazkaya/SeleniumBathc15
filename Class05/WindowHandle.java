package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-704359330%3A1678243148364085&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfpk3HfEp_jr88Z1SMDLIWyQqMDuBfez-j9O4m2FmTrUCTyUHjOGHVie2vvIq1OO1UkROfhdw");

        //click on help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        // click on Privacy button
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        // get the window handle of the parent window
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        //get window handles of all the windows that have been opened up
        Set<String> windowsHandles=driver.getWindowHandles();

        // print all the window handles
        for (String wh:windowsHandles) {
            System.out.println(wh);
            //switch the focus of the driver to help window
            driver.switchTo().window(wh);
            //check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){
                break;
            }
        }
        // to verify, we switched to the right window;
        System.out.println(driver.getTitle());

        // to switch to back page
        driver.switchTo().window(parentWindowHandle); // parentWindowHandle is a string variable which is we declared in the first step of our code

    }
}
