package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Navigating {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate tot website and wait until page is loaded!
        driver.get("https://www.google.com/");

        // Thread.sleep forces selenium to wait, in this example it will wait 3 seconds.
        Thread.sleep(3000);

        driver.get("https://www.facebook.com/");

        // navigate().back() will navigate to previous page
        driver.navigate().back();

        // navigate().forward() will navigate to forward page
        driver.navigate().forward();

        // navigate().refresh() will refresh the page
        driver.navigate().refresh();


        // navigate().to() method doesn't wait for the page to load!
//        driver.navigate().to("https://www.google.com/");

        driver.quit();

    }

}
