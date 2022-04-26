package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    //opening browser setup code
    public void openBrowser(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);//Launch Url
        driver.manage().window().maximize();//Maximise the windows
        //driver.manage().window().minimize();//Minimise the windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//We give implicit time to driver 20sec.
    }
    //Closing browser setup code
    public void closeBrowser(){
        driver.quit();
    }
}
