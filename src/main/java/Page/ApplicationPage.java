package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BaseTest.Base.driver;

public class ApplicationPage {

    @FindBy(xpath = "//*[@title='Search']")
    public WebElement btnSearch;
    @FindBy(xpath = "(//h3[text()='Selenium'])[1]")
    public WebElement textLinkSelenium;
    @FindBy(xpath = "//ul/li[3]")
    public WebElement btnDocumentation;
    @FindBy(xpath = "//a[@id='m-documentationwebdriver']")
    public WebElement btnWebDriver;

    public ApplicationPage() {
        PageFactory.initElements(driver, this);
    }

    public void userLandsToTheGoogleApplicationAndClicksOnTheSearch() {
        btnSearch.click();
    }

    public void userMakesAnSearchForTextInTheSearchBar(String searchText) {
        btnSearch.sendKeys(searchText);
        btnSearch.submit();
    }

    public void userClicksOnTheSeleniumLink() {
        textLinkSelenium.click();
    }

    public void userClicksOnTheDocumentationLinkTab() {
        btnDocumentation.click();
    }

    public void userSelectsWebDriverUnderTheDocumentation() {
        btnWebDriver.click();
    }
}
