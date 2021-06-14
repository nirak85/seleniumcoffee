package StepDefn;

import PracticeHome.FormPage2;
import Util.Basepage;
import Util.Browser;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PracticeSteps2 {
    WebDriver driver;
    FormPage2 formPage2;
    Basepage basepage;
    Browser browser;


@Given("User wants to go to login site")
public void user_wants_to_go_to_login_site() {
        driver = browser.openBrowser();
        formPage2 = PageFactory.initElements(driver, FormPage2.class);
        }

@When("user enter {string} and {string}")
public void user_enter_and(String fname, String lname) {
        formPage2 = PageFactory.initElements(driver, FormPage2.class);
        formPage2.firstName(fname+basepage.randomNumGenerator());
        formPage2.lastName(lname);
    }

@When("fill up all the credential and pass {string}")
public void fill_up_all_the_credential_and_pass(String date) {
        formPage2 = PageFactory.initElements(driver, FormPage2.class);
        formPage2.gender();
        formPage2.year();
        formPage2.date(date+basepage.randomNumGenerator());
    }

@When("fill up other forms")
public void fill_up_other_forms() {
        formPage2 = PageFactory.initElements(driver, FormPage2.class);
        formPage2.profession();
        formPage2.flavorSel();
        formPage2.continent();
        formPage2.seleniumCommand();
    }

@Then("user should able to go next page")
public void user_should_able_to_go_next_page() {
        formPage2 = PageFactory.initElements(driver, FormPage2.class);
        formPage2.submit();
    }
}
