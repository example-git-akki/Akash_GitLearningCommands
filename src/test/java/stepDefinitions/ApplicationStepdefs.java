package stepDefinitions;

import BaseTest.Base;
import Page.ApplicationPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ApplicationStepdefs extends Base {


    @Before
    public void openBrowser() {
        Base.initBrowser();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
//        if (scenario.isFailed()) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
//        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    ApplicationPage aPage;


    @Given("user lands to the Google Application and clicks on the Search")
    public void userLandsToTheGoogleApplicationAndClicksOnTheSearch() {
        aPage = new ApplicationPage();
        aPage.userLandsToTheGoogleApplicationAndClicksOnTheSearch();
    }

    @Then("user makes an search for text {string} in the search bar")
    public void userMakesAnSearchForTextInTheSearchBar(String searchText) {
        aPage.userMakesAnSearchForTextInTheSearchBar(searchText);
    }

    @Then("user clicks on the Selenium link")
    public void userClicksOnTheSeleniumLink() {
        aPage.userClicksOnTheSeleniumLink();
    }

    @Then("user clicks on the Documentation link tab")
    public void userClicksOnTheDocumentationLinkTab() {
        aPage.userClicksOnTheDocumentationLinkTab();

    }

    @Then("user selects WebDriver under the Documentation")
    public void userSelectsWebDriverUnderTheDocumentation() {
        aPage.userSelectsWebDriverUnderTheDocumentation();
    }
}
