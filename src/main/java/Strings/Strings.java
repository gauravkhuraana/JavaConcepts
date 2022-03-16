package Strings;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class Strings {

    final static String randomid = UUID.randomUUID().toString();
    final static String startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

    @Test
    public static void stringFormat()
    {
        // %% when you want a % symbol
        // %s to replace the string at the end

        String query = String.format("select count(*) from test where time > '%%%s%%' and text like '%% %s %%' \n",startTime,randomid);
        System.out.println(query);
    }
}
