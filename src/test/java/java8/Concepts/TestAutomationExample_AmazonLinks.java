package java8.Concepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Consumer;

public class TestAutomationExample_AmazonLinks {

    WebDriver driver;
    @Test
    public void printallLinks()
    {
       driver = new ChromeDriver();
        driver.get("https://amazon.in");
        List<WebElement> elements = driver.findElements(By.tagName("a"));

        for (WebElement elm:elements
             ) {
            System.out.println(elm.getText());
        }

        System.out.println("Now doing the foreach way ");
        elements.forEach(s-> System.out.println(s.getText()));
        System.out.flush();

        Consumer<WebElement> con = (s) -> {
            if(!s.getText().isEmpty())
                System.out.println(s.getText());
        };

        System.out.println("--- >   The java 8 way  with multi line lambda <--- ");
        elements.forEach(con);
    }
}
