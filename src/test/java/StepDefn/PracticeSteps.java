package StepDefn;

import PracticeHome.FormPage;
import Util.Basepage;
import Util.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PracticeSteps {
    WebDriver driver;
    FormPage formPage;
    Browser browser;
    Basepage basepage;

    @Given("User should be able to fill the form as a valid user")
    public void user_should_be_able_to_fill_the_form_as_a_valid_user() throws Throwable {
        driver= browser.openBrowser();
        formPage= PageFactory.initElements(driver, FormPage.class);
    }

    @When("User entered Firstname {string} Lastname {string}")
    public void user_entered_firstname_as_lastname_as(String fname, String lname) throws Throwable {
        formPage= PageFactory.initElements(driver, FormPage.class);
        formPage.firstName(fname);
        formPage.lastName(lname);
    }

    @When("User complete all the text field and enterd date {string}")
    public void user_complete_all_the_text_field_and_enterd_date_as(String date) throws Throwable {
        formPage= PageFactory.initElements(driver, FormPage.class);
        formPage.gender();
        formPage.year();
        formPage.date(date);
        formPage.profession();
        formPage.flavorSel();
        formPage.continent();
        formPage.seleniumCommand();
    }

    @Then("User should be in next page")
    public void user_should_be_in_next_page() throws Throwable {
        formPage= PageFactory.initElements(driver, FormPage.class);
        System.out.println("You are in Next page");
    }
}
