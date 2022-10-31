package RegularExpression;

import CommonQuestions.PatternTraingle;
import org.openqa.selenium.By;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatching {


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("Test Patter (+1257)");
        while(matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            System.out.println("Pattern matched is " + number);
        }

    }
}
