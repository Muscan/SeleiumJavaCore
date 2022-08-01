import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class App {
    public static void main(String[] args)  {
//        WebDriver driver = BaseClass.basePage();
//
//        //GetLocators.homePageLocators(driver);
//
//        try {
//            //GetText.getTextFromPage(driver);
//            //ClickElements.clickOnText(driver);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            driver.close();
//        }
//       SendText.sendTextMethod(driver);
//         driver.close();
        //Uncomment this section to run the GetTables
        //WebDriver driver = BaseClass.tablesMethod();
        //GetTables.playTablesMethod(driver);
        //driver.close();

        //Section Waits
        // WebDriver driver = BaseClass.basePage();
        //Waits.waitTypes(driver);

        //section JS Executor
//
//        WebDriver driver = BaseClass.basePageUdemy();
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("window.location = 'https://wikipedia.com'");
//        JavaScriptExecutor.jsExecutor(driver);

        //JS Alerts
//        WebDriver driver = BaseClass.baseForAlerts();
//        AlertsInSelenium.alertTypes(driver);

        //IFrame
        //WebDriver driver = BaseClass.iFrameUse();
        //IFrame.useIFrame(driver);

        //DropDown
        WebDriver driver = BaseClass.dropDownBase();
        DropDown.selectFromDropDown(driver);



    }
}
