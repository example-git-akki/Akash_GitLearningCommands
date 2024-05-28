package BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Base {

//    This is my base method
    public static Properties prop;
    public static WebDriver driver;

    public Base() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("C:\\Chatbot New Latest\\Cucumber_Report\\src\\main\\java\\config\\config.properties");
            prop.load(fis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void initBrowser() {
        String browser = prop.getProperty("Browser");
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            System.out.println("No driver present");
        }

        String url = prop.getProperty("Application");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }
}
