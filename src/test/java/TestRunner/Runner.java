package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
        glue={"StepDefn"},
        //strict=false,
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

}
)

public class Runner {
}
