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
        WebDriver driver = BaseClass.basePage();
        Waits.waitTypes(driver);




    }
}
