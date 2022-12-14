package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_SeleniumIntro {

    public static void main(String[] args) {

        // define driver type and driver path (location)
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

        // create a new WebDriver object
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to website
        driver.get("https://techno.study/");

        // Quit the browser
        driver.quit();

    }

}
