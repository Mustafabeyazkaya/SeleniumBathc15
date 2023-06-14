package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.delta.com/");

        // find the calendar element
        WebElement calanderBtn=driver.findElement(By.xpath("//div[@class='calDispValueCont icon-Calendar  ']"));
        // click the calendar button
        calanderBtn.click();

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
//        get the next button
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

//        click on next button until you find the right month
        boolean isFound=false;

        while(!isFound){

            String monthText= month.getText();
            if(monthText.equalsIgnoreCase("January")){
                //SELECT THE DAY
               List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
               for(WebElement day:days){
                  String day_text = day.getText();
                  if(day_text.equalsIgnoreCase("20")){
                      day.click();
                      isFound=true;
                       break;
                    }
               }
            }
            else {
                next.click();
            }
        }
    }
}
