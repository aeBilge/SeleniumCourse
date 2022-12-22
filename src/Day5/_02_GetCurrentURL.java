package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_GetCurrentURL {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        driver.quit();

    }

}
