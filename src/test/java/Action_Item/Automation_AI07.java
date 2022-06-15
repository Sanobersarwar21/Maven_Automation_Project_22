package Action_Item;

import ReusableClasses.Reusable_Actions_Loggers;
import ReusableClasses.Reusable_Annotations_class;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Automation_AI07 extends Reusable_Annotations_class {

    @Test(priority = 1)
    public void clickOnPayMyBill() {
        driver.navigate().to("https://www.duke-energy.com");
        //click on the tab that says Pay My Bill
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='relative flex items-center md:block px-48 md:px-12 py-12 md:py-24 h-full text-teal-darker bg-white rounded-md shadow hover:shadow-md transform transition-all duration-300 hover:-translate-y-4 md:will-change-transform']", logger, "Pay My Bill");
        //click on location
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='w-1/3 md:w-auto']", logger, "North Carolina");
    }//end of test 1

    @Test(priority = 2)
    public void clickOnDukeEnergyCarolinas() {
        driver.navigate().to("https://www.duke-energy.com");
        //click on the Duke Energy Carolinas
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='pb-2 border-b border-white group-hover:border-current']", logger, "Duke Energy Carolinas");
    }//end of test 2

    @Test(priority = 3)
    public void clickOnSignInAndPay() {
        driver.navigate().to("https://www.duke-energy.com");
        //click On Sign In And Pay tab
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='flex flex-col flex-grow justify-center sm:justify-start text-left sm:text-center']", logger, "click On Sign In And Pay");
        //end of logger per test
    }//end of test 3

    @Test(priority = 4)
    public void clickOnSearchField() {
        driver.navigate().to("https://www.duke-energy.com");
        //click on search field
        Reusable_Actions_Loggers.clickAction(driver,"//*[@name='userId']",logger,"Username/Email");

        //click on password search field
        Reusable_Actions_Loggers.clickAction(driver,"//*[@type='password']",logger,"password");

        //submit the Sign In
        Reusable_Actions_Loggers.clickAction(driver,"//*[@ng-click='attributionSubmitForm('sign_in','Manage Account','Sign In','event-click',$event,'/form/Login/GetAccountValidationMessage')']",logger,"SIGN IN");

    }//end of test 4

    @Test(priority = 5)
    public void clickOnSignUpNow(){
        driver.navigate().to("https://www.duke-energy.com");
        //click on search field
        Reusable_Actions_Loggers.clickAction(driver,"//*[@ class='btn btn-blue  btn-medium']",logger,"Sign Up Now");

        //using jse to scroll so you can see all the options best describe you
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("scroll(0,5300)");

    }//end of test 5



    @AfterSuite
    public void quitSession(){
        driver.quit();
        reports.flush();
    }//end of after suite




}//end of class


