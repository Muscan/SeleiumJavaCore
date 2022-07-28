import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetTables {
    public static void playTablesMethod(WebDriver driver){
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[1]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[2]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[3]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[1]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[3]")).getText());

        List<WebElement> listOfWebElements = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        for(WebElement element : listOfWebElements) {
            System.out.println(element.getText());
        }
    }
}
