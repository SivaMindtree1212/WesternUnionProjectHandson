package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());
        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        List<String> alllinkshref = alllinks.stream().map(link -> link.getAttribute("href"))
                .collect(Collectors.toList());
        alllinkshref.forEach(System.out::println);
        driver.quit();


    }
}
