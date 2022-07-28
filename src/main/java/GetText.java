import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class GetText {
    public static void getTextFromPage(WebDriver driver) throws Exception{
        WebElement titleOfHomePage = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));
        String titleText = titleOfHomePage.getText();
        String expectedText = "Wikipedia";

        if(titleText.equals(expectedText))
            System.out.println("Test passed");
        else{
            System.out.println("Test failed");

            throw new Exception();
        }
    }
}
