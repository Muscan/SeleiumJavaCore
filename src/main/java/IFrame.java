import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

    public static void useIFrame(WebDriver driver){
        driver.manage().deleteAllCookies();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        //Accept cookie main page "Accept all and visit the site"
        WebElement cookieButton = driver.findElement(By.id("accept-choices"));
        cookieButton.click();
        //Get title from main Page,
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        //get item Html IFrames
        String title = driver.findElement(By.cssSelector("#main > h1")).getText();
        System.out.println(title);

        //#accept-choices

        WebElement iframe = driver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));
        driver = driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");

        WebElement sqlTitle = driver.findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a:nth-child(6)"));
        sqlTitle.click();
        System.out.println(sqlTitle.getText());
        driver.close();
    }

}

