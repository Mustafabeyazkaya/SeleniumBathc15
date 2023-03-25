package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // open smart bear
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        //find the username
        WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]")); // you can put the method into the variable

        username.sendKeys("Tester");// the same this as this //driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Tester");

        //find the password field
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        //clear the username text box using method clear()
        username.clear();// this is show you why we declare thing in the variables

        // to get the text username which is beside the username text box
        WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));

        System.out.println(usernameText.getText());// this will be appeared at console as Username:

        //get the text password which is beside the password text box
        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        String passText=passwordText.getText();
        System.out.println(passText);














    }
}
