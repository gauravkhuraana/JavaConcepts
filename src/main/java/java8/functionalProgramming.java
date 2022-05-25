package java8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;

public class functionalProgramming {

    WebDriver driver;

    // lets do the hard way and in next function we will do the easy way
    @Test
    public void captureAllLinksFromAmazon()
    {
        //https://www.youtube.com/watch?v=McsieQgRxqg following this
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.in");

        List<WebElement> alllinks=driver.findElements(By.tagName("a"));
        Set<String> allElements = new HashSet<String>();

        System.out.println("Here are all links");
        for(int i=0;i<alllinks.size();i++)
        {
            if(!alllinks.get(i).getText().isEmpty())
            {
                // To remove duplicates use a set
                allElements.add(alllinks.get(i).getText());
            }

        }
        // Printining the hashset one by one
        for(String val:allElements)
            System.out.println(val);

        List<String> sort = new ArrayList<>(allElements);
        // lets sort the list now
        Collections.sort(sort);
        System.out.println("Lets sort them out as well after converting to arraylisy");
        for(String val:sort)
            System.out.println(val);

        driver.quit();
    }

    @Test
    public void captureAllLinksFromAmazonViaJava8()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.in");

        driver.findElements(By.tagName("a"))
                .stream()
                .map(s->s.getText())// to get the elements as String
                .distinct() // to remove duplicates
                .sorted() // lets sort them as well
                .filter(s->s.startsWith("C")||s.startsWith("D"))
                .forEach(s-> System.out.println(s));
                 // or you can write like
                 // .forEach(System.out::println)

        driver.quit();
    }
}
