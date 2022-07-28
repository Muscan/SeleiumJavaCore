import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendText {
    public static void sendTextMethod(WebDriver driver){
       WebElement searchBox =  driver.findElement(By.id("searchInput"));
       String searchString = "Selenium Webdriver";
       searchBox.sendKeys(searchString);
       WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));

       searchButton.click();
       WebElement searchResults = driver.findElement(By.id("firstHeading"));
       String expectedSearchPage = "Search results";

       if (searchResults.getText().equals(expectedSearchPage)){
           System.out.println("Search results page is displayed");
       }else{
           System.out.println("Search results NOT displayed");
       }
    }
}
