package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {
    static WebDriver driver;

    public static WebDriver openBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/nirajshakya/Desktop/test/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        return driver;

    }

}
