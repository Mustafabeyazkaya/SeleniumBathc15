package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // go to syntaxtechs.com
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        // task 1   access-level1--table based access
        // get the whole table accessed and print it on the console

        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));

        String table_data = table.getText();
        /*System.out.println(table_data);*/     // you can comment out it to see executions


        // task 2   row -level access
        // get the rows of the table and print them
        // modification   :  print the row that contains Company google
        List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        // by using regular loop

      /*  int rowSize= rows.size();
        for (int i = 0; i < rowSize; i++) {
         String row_text=rows.get(i).getText();
            System.out.println(row_text);    // you can comment out it to see executions
        }*/

        // or by using foreach loop

        // print the rows
        for (WebElement row:rows) {
            //extract text from each row
            // modification   :  print the row that contains Company google
            String row_text=row.getText();
            if (row_text.contains("Google")){
            /*System.out.println(row_text);*/  // you can comment out it to see executions
            }
        }

        // task 3 column -level access
        List<WebElement>columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column:columns) {
            /*System.out.println(column.getText());*/  // you can comment out it to see executions
        }

        // task 4 : just print the first column of every row
        List<WebElement>firstColm=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement firstCol:firstColm) {
            /*System.out.println(firstCol.getText());*/ // you can comment out it to see executions
        }

        // task 5 : just print the third column of every row
        List<WebElement>thirdColm=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
        for (WebElement thirdCol:thirdColm) {
            System.out.println(thirdCol.getText());
        }
    }
}
