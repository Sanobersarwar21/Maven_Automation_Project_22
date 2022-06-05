package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_AI03 {
    public static void main(String[] args) throws InterruptedException{


        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("Incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //setting your driver as headless(running on background)
        //options.addArguments("headless");
        //options.addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);
        //maximize the driver
        //driver.manage().window().maximize
        //capture search number and print for following hobbies using arraylist and for loop
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Soccer");
        hobbies.add("Walking");
        hobbies.add("Travelling");

        for(int i = 0; i < hobbies.size(); i++){
            //go to google home page
            driver.navigate().to("https://www.bing.com");
            Thread.sleep(3000);
            //locate element for search field and type keyword 'hobbies'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobbies.get(i));
            //submit on google search button
            driver.findElement(By.xpath("//*[@id='sb_form_q']")).submit();
            Thread.sleep(2500);
            //capture the google search and print it
            String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //System.out.println("Result is " + searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
           // String replaceParanth = arrayResult[3].replace("(", "").replace(")", "");
            System.out.println("My search number for hobby " + hobbies.get(i) + " is " + arrayResult[0]);

        }//end of for Loop

        // quit the driver
        driver.quit();

    }//end of main
}//end of java class


