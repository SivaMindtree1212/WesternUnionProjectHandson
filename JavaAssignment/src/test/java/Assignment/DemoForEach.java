package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class DemoForEach {

    public static void main(String[] args) {
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {

            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }

        driver.quit();

    }
}
