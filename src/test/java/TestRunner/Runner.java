package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Chatbot New Latest\\Cucumber_Report\\src\\test\\resources\\features",
        glue = "stepDefinitions",
        plugin = {
//                "html:target/cucumber-html-report",
                "json:target/cucumber-reports/cucumber.json",}

        )
public class Runner {
}
