import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class DropDown {
    public static  void selectFromDropDown(WebDriver driver){
        //iframeResult
        driver.manage().deleteAllCookies();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        //Accept cookie main page "Accept all and visit the site"
        WebElement cookieButton = driver.findElement(By.id("accept-choices"));
        cookieButton.click();
        WebElement iframe = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iframe);
        WebElement selectableDropDown = driver.findElement(By.id("cars"));

        //Select elem from drop down
        Select select = new Select(selectableDropDown);
        select.selectByIndex(1);
        String selectedValueFromDropDown = select.getFirstSelectedOption().getText();
        System.out.println(selectedValueFromDropDown);

        //Click on Submit Button
        WebElement submitButton = driver.findElement(By.cssSelector("body > form > input[type=submit]"));
        submitButton.click();
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");

        //Find displayed result
        WebElement result = driver.findElement(By.cssSelector("body > div.w3-container.w3-large.w3-border"));
        String diplayedSelectedValue = result.getText();
        String substring = diplayedSelectedValue.substring(5, diplayedSelectedValue.length()-1);
        if(selectedValueFromDropDown.toLowerCase().equals(substring)){
            System.out.println("Value is displayed");
        }
        else{
            System.out.println("Result value was not displayed");
        }
        driver.close();
    }
}

