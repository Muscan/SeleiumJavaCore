import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

    public static void useIFrame(WebDriver driver){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        WebElement cookieButton = driver.findElement(By.id("accept-choices"));
        cookieButton.click();
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        String title = driver.switchTo().frame(0).findElement(By.cssSelector("#main > h1")).getText();
        System.out.println(title);
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");

        //WebElement iframe = driver.findElement(By.id("a8ce8ffe7c48dac78cdf281cf533f570"));

        driver = driver.switchTo().frame(1);//.findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a:nth-child(5)")).click();
        //javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        //cookieButton = driver.findElement(By.id("accept-choices"));
       //cookieButton.click();
        driver.close();
    }

}

