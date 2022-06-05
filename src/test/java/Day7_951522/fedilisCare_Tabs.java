package Day7_951522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class fedilisCare_Tabs {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("Incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //options.addArguments("start-fullscreen");
        //options.addArguments("headless");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calculator
        driver.navigate().to("https://www.fideliscare.org");
        Thread.sleep(3000);

        //click on shop for a plan
        driver.findElements(By.xpath("//*[text()='Shop For a Plan']")).get(0).click();
        //wait a bit for page to load
        Thread.sleep(1000);
        //click on medicaid Managed care
        driver.findElements(By.xpath("//*[text()='Medicaid Managed Care']")).get(0).click();
        //wait a bit for page to load
        Thread.sleep(1000);
        //click on search under find a doctor card
        driver.findElement(By.xpath("//*[@href='/findadoctor']")).click();
        //wait a bit for new tab to open
        Thread.sleep(1000);
        //store new tabs in an array list, we use getWindowHandles method to get list of class
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tab, it should be at index 1
        driver.switchTo().window(tabs.get(1));
        driver.findElement(By.xpath("//*[@class='fal fa-stethoscope fa-fw']")).click();
        //wait a bit for page to load
        Thread.sleep(1000);
        //close the new tab
        driver.close();
        //switch back to the default tab
        driver.switchTo().window(tabs.get(0));
        //then click on providers card
        driver.findElement(By.xpath("//*[@class='fal fa-stethoscope fa-fw']")).click();
        //wait until provider card is clicked on
        Thread.sleep(1000);





    }//end of main
}//end of java class
