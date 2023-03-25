package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.uitestpractice.com/Students/Switchto");

        //switch to the iframe which contains the input box
        //method : by index
        driver.switchTo().frame(0);

        //this statement will shift the focus to the first frame
        WebElement textBox =driver.findElement(By.xpath("//input[@id='name']"));

        //sen some text
        textBox.sendKeys("abracadabra");

        //get the text click on from parent window
        driver.switchTo().defaultContent();// to go back to previous page

        // find the
        WebElement text= driver.findElement(By.xpath("//h3"));
        System.out.println("The text is: "+text.getText());

        // get the text enter name in iframe
        driver.switchTo().frame("iframe_a");

        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("The Label is: "+getLabel.getText());

        // switch focus to the main page
        driver.switchTo().defaultContent();

        // third Method switch to an iframe using WebElement
        //clear whatever is written in the text box
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);

        textBox.clear();
    }
}
