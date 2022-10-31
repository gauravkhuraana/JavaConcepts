package java8.Concepts;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

@Slf4j
public class selectDropDown {

    WebDriver drv;
    @Test
    public void selectionTest() throws InterruptedException {
        drv= WebDriverManager.chromedriver().create();
        drv.get("https://demoqa.com/select-menu");
        WebElement slElem = drv.findElement(By.id("oldSelectMenu"));


        selectAll(slElem,"red",selectStrategy.selectByValue);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);

        selectAll(slElem,"3",selectStrategy.selectByIndex);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);

        selectAll(slElem,"Black",selectStrategy.selectByVisibleText);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);



        selectDropDownViaConsumer(e->e.selectByValue("4"),slElem);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);

        selectDropDownViaConsumer(e->e.selectByVisibleText("Yellow"),slElem);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);

       List<WebElement> options = new Select(drv.findElement(By.id("cars"))).getOptions();
       options.forEach(el->el.click());
       Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);



    }

    private void selectDropDownViaConsumer(Consumer<Select> consumer,WebElement elemen)
    {
        Select sl = new Select(elemen);
        consumer.accept(sl);
    }

    public void selectAll(WebElement elm,String value,selectStrategy strategy)
    {
        Select sl = new Select(elm);
        //elm.click();

        switch(strategy.toString()) {
            case "selectByValue":
                sl.selectByValue(value);
                break;
            case "selectByIndex":
                sl.selectByIndex(Integer.parseInt(value));
                break;
            case "selectByVisibleText" :
                sl.selectByVisibleText(value);

        }



    }
}
