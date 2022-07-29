import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {
    public static void jsExecutor(WebDriver driver){

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        WebElement cookieOk = driver.findElement(By.id("onetrust-accept-btn-handler"));
        if (cookieOk.isDisplayed()){
            cookieOk.click();
            System.out.println("Cookie button OK clicked");
        }
        else{
            System.out.println("Not ok");
            return;
        }
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        WebElement addToCart = driver.findElement(By.cssSelector(".sidebar-container--purchase-section--17KRp > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > button:nth-child(1)"));

        //Clicking with JS Executor


        //clicking with JS executor
        javascriptExecutor.executeScript("arguments[0].click()",addToCart);

        //Setting up timeouts
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");

        //Changing the webpage
        javascriptExecutor.executeScript("window.location = 'https://wikipedia.com'");

        //Scroll the webpage
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
    }
}
