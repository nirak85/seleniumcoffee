package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Basepage {
    WebDriver driver;

    public Basepage(WebDriver driver){
        this.driver= driver;
    }
    public static void dropDown(WebElement string, String visibleText){
        Select sel = new Select(string);
        sel.selectByVisibleText(visibleText);
    }
    public static int randomNumGenerator(){
        Random random= new Random();
        int randomNum= random.nextInt(777);
        return randomNum;
    }
}
