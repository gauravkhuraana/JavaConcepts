package RegularExpression;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatching {


        @Test
    public void test(){

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("Test Patter (+1257)");
        while(matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            System.out.println("Pattern matched is " + number);
        }

    }
}
