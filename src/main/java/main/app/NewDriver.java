package main.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class NewDriver {
    public WebDriver driver;

    public WebDriver create() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Patryk\\IdeaProjects\\FinalApp\\src\\main\\java\\Properties");
        prop.load(fis);
        String driverType = prop.getProperty("browser");

        if (driverType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
