import org.testng.annotations.Test;
import enums.*;

public class enumTest {


    @Test
    public void testEnums() {
        // Using direct Value without a constructor
        System.out.println(" getting a single value directly " + singleDirectValue.CHROME);

        // Using direct Value with a constructor
        System.out.println(" getting a single value using enum having single value " + flowtypes_oneValue.NEW);

        // Using a function to get the value
        System.out.println(" getting a single value using enum having 2 values" + endpoints_MoreParameters.PEN_PATH.getResourceName());
        System.out.println(" getting a single value using enum having 2 values" + endpoints_MoreParameters.PEN_PATH.getResourcePath());

        // with lombok
        System.out.println(" getting a value with minimal code using lombok " + withLombok.IND); // will get us first value
        System.out.println(" getting a value with minimal code using lombok " + withLombok.IND.getCode());
        System.out.println(" getting a value with minimal code using lombok " + withLombok.IND.getCountry());



    }

}
