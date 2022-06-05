package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElements_mortagagecalc {
    public static void main(String[] args) throws InterruptedException{
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

        //navigate to mortgagecalculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(1500);

        //click, clear and enter new value on home value field
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.click();
        homeValue.click();
        //Thread.sleep(3000);
        homeValue.sendKeys("45000");
        //click on % radio button
        driver.findElement(By.xpath("//*[value='percent']")).click();
        //click clear and enter new data on down payment field
        WebElement downpayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        downpayment.click();
        downpayment.click();
        downpayment.sendKeys("5");



    }//end of main
}//end of java class

