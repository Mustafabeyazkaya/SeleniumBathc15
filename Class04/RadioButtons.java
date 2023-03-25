package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        // tell your project where the webdriver is located
        //for mac user please do not use ".exe" with chromedriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement maleBtton=driver.findElement(By.cssSelector("input[value='Male']"));

        // check if the radio button is enabled
        boolean isEnabledMale=maleBtton.isEnabled();
        System.out.println("The radio button male is enabled? "+isEnabledMale);

        // check if the radio button is Displayed
        boolean isDisplayedMale=maleBtton.isDisplayed();
        System.out.println("The radio button male is displayed? "+isDisplayedMale);

        // check if the radio button is Selected
        boolean isSelectedMale=maleBtton.isSelected();
        System.out.println("The radio button male is selected? "+isSelectedMale);

        // if the radio button is not selected click on it
        if (!isSelectedMale) {
            maleBtton.click();
        }
       isSelectedMale=maleBtton.isSelected();// you need to reassign before execute, otherwise it will execute the first value which is not selected
        System.out.println("The radio button male is selected? "+isSelectedMale);
    }

}
