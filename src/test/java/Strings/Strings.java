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
    public void stringFunctions()
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

        String locale = "en-in";
        String lang = locale.split("-")[0];
        String country = locale.split("-")[1];
        System.out.println(lang + "   " + country);


    }

    @Test
    public void stringSplit()
    {
        String time = "10:16 , 3-4-2023 IST";
        time = time.split(" ")[2];
        System.out.println(time);

        time = "10:41 , 3-Apr-2023 IST";
        time = time.split(" ")[2];
        System.out.println(time);

        time = "10:42 , 2023-4-3 IST";
        time = time.split(" ")[2];
        System.out.println(time);

        time = "03:32 PM, 14-4-2023 IST";
        time = time.split(" ")[2];
        System.out.println(time);

        String numberInotherLang = "5 688/5 777";
        int number=0;
        number = Integer.parseInt(numberInotherLang.split("/")[0].replace(",", "").replace(" ", ""));
        System.out.println(number);



    }




}
