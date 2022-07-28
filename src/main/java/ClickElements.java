import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickElements {

    public static void clickOnText(WebDriver driver) throws Exception
    {

       WebElement textEnHomePage = driver.findElement(By.id("js-link-box-en"));
       textEnHomePage.click();

       WebElement welcomeEn = driver.findElement(By.id("mp-welcome"));
       String expectedTitle = "Welcome to Wikipedia,";


       if (welcomeEn.getText().equals(expectedTitle)){
           System.out.println("English as link for Language is displayed");

       }
       else {
           System.out.println("Text English language was not displayed");
           throw  new Exception("Language or element was not found");
       }
    }
}
