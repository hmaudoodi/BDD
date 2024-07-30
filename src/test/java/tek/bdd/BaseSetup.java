package tek.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {

    //Encapsulation driver instance
    private static WebDriver driver;
    public void setupBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
    }

    /*
    Web Driver insurance
    Navigation to retail
    maximize
    and implicitly wait

     */

    public void quitBroswer() {
        //null check before quit
        if (driver != null) {
            driver.quit();
        }
    }

    //Give read only indirect access to driver
    //restrict setting new driver istance
    public WebDriver getDriver() {
        return driver;
    }



}
