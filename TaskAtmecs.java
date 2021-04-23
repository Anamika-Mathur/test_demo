import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Task--navigate to https://www.atmecs.com/ and scroll to bottom of page and select India-Chennai in Contact Us.

public class TaskAtmecs {


    public static void main(final String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "D:\\seleniumResources\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.atmecs.com/");

        driver.manage().window().maximize();

        //Find element by link text and store in variable "Element"
        WebElement scrollElement = driver.findElement(By.xpath("//div[@id='footer']"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", scrollElement);

        driver.findElement(By.xpath("//ul[@id='menu-contact-us']/li[@id='menu-item-160']/a"))
                .click();

    }
}
