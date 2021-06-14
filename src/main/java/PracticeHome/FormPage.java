package PracticeHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
   public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@name=\"firstname\"]")
        WebElement Fname_Locator ;
    @FindBy(how = How.XPATH, using = "//input[@name=\"lastname\"]")
        WebElement Lname_Locator;
    @FindBy(how = How.XPATH, using = "//input[@value=\"Female\"]")
        WebElement Gender_Locator;
    @FindBy(how = How.XPATH, using = "//input[@value=\"3\"]")
        WebElement Years_Locator;
    @FindBy(how = How.XPATH, using = "//tr[5]/td[2]/input[@type=\"text\"]")
        WebElement Date_Locator ;
    @FindBy(how = How.XPATH, using = "//span/input[@value=\"Manual Tester\"]")
        WebElement Profession_Locator;
    @FindBy(how = How.XPATH, using = "//span/input[@value=\"Selenium IDE\"]")
        WebElement FlavorSel_Locator;
    @FindBy(how = How.XPATH, using = "//select[@name=\"continents\"]")
        WebElement Continents_Locator;
    @FindBy(how = How.XPATH, using = "//select[@name=\"selenium_commands\"]")
        WebElement SeleniumCommands_Locator;
    @FindBy(how = How.XPATH, using = "//button[@name=\"submit\"]")
        WebElement Submit_Locator;

    public FormPage(){
        this.driver=driver;
    }
    public void firstName(String fname){
        Fname_Locator.sendKeys(fname);
    }
    public void lastName(String lname){
        Lname_Locator.sendKeys(lname);
    }
    public void gender(){
        Gender_Locator.click();
    }
    public void year(){
        Years_Locator.click();
    }
    public void date(String date){
        Date_Locator.sendKeys(date);
    }
    public void profession(){
        Profession_Locator.click();
    }
    public void flavorSel(){
        FlavorSel_Locator.click();
    }
    public void continent(){
        Select select= new Select(Continents_Locator);
        select.selectByVisibleText("Australia");
    }
    public void seleniumCommand(){
        Select select= new Select(SeleniumCommands_Locator);
        select.selectByVisibleText("Wait Commands");
    }
    public void submit(){
        Submit_Locator.click();
    }
}
