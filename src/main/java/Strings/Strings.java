package Strings;

import org.apache.commons.lang3.text.WordUtils;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
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

    @Test
    public static void stringFunctions()
    {
        // %% when you want a % symbol
        // %s to replace the string at the end

        String str = "Hare Krishna Hare Krishna";
        System.out.println(str.substring(0)); // H
        System.out.println(str.substring(0,3)); // Har
        System.out.println(str.substring(2,4)); // re

        String str1 = "02-11-2022 - 2-11-2022 : 04:00 AM - 04:00 PM";
        System.out.println(str1.substring(6,10)); // re
        System.out.println(str1.substring(3,5)); // re

        System.out.println(WordUtils.capitalize("TYPES"));
        System.out.println(WordUtils.capitalizeFully("TYPES"));


    }
}
