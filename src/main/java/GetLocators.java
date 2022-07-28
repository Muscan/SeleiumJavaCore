import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetLocators {
    public static void homePageLocators(WebDriver driver){
        //locators
        //id
        Long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        Long end = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by ID is: " + (end - start));

        //xpath
        start = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
        end = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by Xpath is: " + (end - start));

        //cssSelector
        start = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang2"));
        end = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by CSSSelector is: " + (end - start));



    }
}
