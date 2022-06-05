package Day8_052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTitle_Example {
    public static void main(String[] args) {
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
        //navigate to google page
        driver.navigate().to("https://www.google.com");
        //capture the title of the page and compare it with your expected title 'GOOGLE'
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Google")){ ;
        System.out.println("My title matches");
    }else{
        System.out.println("Title doesn't match.Actual Title is " + actualTitle);
    }
}//end of main
}//end of class
