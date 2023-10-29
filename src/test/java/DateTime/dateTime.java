package DateTime;


import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class dateTime {

    @Test
    public void test() {

        // SimpleDateFormat
        final String timeStamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(Calendar.getInstance().getTime());
        final String startTimeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println("The date time using new SimpleDateFormat(\"yyyyMMdd-HHmmss\").format(Calendar.getInstance().getTime()) "+timeStamp); //20220331-105444
        System.out.println("The date time using new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\").format(Calendar.getInstance().getTime() "+startTimeStamp); //2022-03-31 10:54:44

        // Instant
        String now = Instant.now().toString();
        System.out.println("The date time using Instant.now().toString() "+now); // 2022-03-31T05:24:44.492Z

        now = String.valueOf(Instant.now().toEpochMilli());
        System.out.println("The date time using Instant.now().toEpochMilli() "+now); // 1648704284642

        // Using localDate
        System.out.println("The localdate using LocalDate.now() " + LocalDate.now()); // 2022-03-31
        System.out.println("The localdate using LocalDate.now().plusDays(10) " + LocalDate.now().plusDays(10)); // 2022-04-10

        final Clock clock = Clock.systemUTC();
        final LocalDateTime nowLocal = LocalDateTime.now(clock);
        System.out.println("The localdate using now.toInstant(ZoneOffset.UTC) " + nowLocal.toInstant(ZoneOffset.UTC)); // 2022-04-10


        System.out.println("LocalDateTime.now(ZoneOffset.UTC) = "+  LocalDateTime.now(ZoneOffset.UTC)); //2023-02-09T08:37:47.765186
        System.out.println("LocalDateTime.now() = "+  LocalDateTime.now());                             //2023-02-09T14:07:47.765186

        // to deal with various timezones
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("DateTimeFormatter.ofPattern(yyyy-MM-dd HH:mm:ss z) " + zonedDateTime.format(formatter)); // 2023-02-09 14:07:47 IST

        Locale locale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MONTH_FIELD,locale);
        System.out.println(dateFormat.format(new Date()));  // 9 févr. 2023


        String pattern = "dd-MMM-yyyy HH:mm z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("fr", "FR"));
        String date = simpleDateFormat.format(new Date());
        System.out.println(date); // 09-févr.-2023 14:07 IST

        pattern = "hh:mm,dd-MMM-yyyy z"; // hh is 12 hours format
        simpleDateFormat = new SimpleDateFormat(pattern, new Locale("fr", "FR"));
        date = simpleDateFormat.format(new Date());
        System.out.println(date); // 02:07,09-févr.-2023 IST

        pattern = "HH:mm,dd-MMM-yyyy z"; // HH is 24 hours format
        simpleDateFormat = new SimpleDateFormat(pattern, new Locale("fr", "FR"));
        date = simpleDateFormat.format(new Date());
        System.out.println(date); // 14:11,09-févr.-2023 IST

        pattern = "HH:mm,d-MMM-yyyy z"; // HH is 24 hours format
        simpleDateFormat = new SimpleDateFormat(pattern, new Locale("fr", "FR"));
        date = simpleDateFormat.format(new Date());
        System.out.println(date); // 14:11,09-févr.-2023 IST

        pattern = "hh:mm aa , M/d/y z"; // aa means AM / PM in caps
        simpleDateFormat = new SimpleDateFormat(pattern, new Locale("fr", "FR"));
        date = simpleDateFormat.format(new Date());
        System.out.println("we have AM/PM because we used aa "+date); // 14:11,09-févr.-2023 IST

        pattern = "z"; // HH is 24 hours format
        simpleDateFormat = new SimpleDateFormat(pattern, new Locale("fr", "FR"));
        date = simpleDateFormat.format(new Date());
        System.out.println(date);//  IST

        TimeZone timeZone = TimeZone.getDefault();
        String systemTimeZone = timeZone.getID();
        Calendar calendar = Calendar.getInstance(timeZone);
        System.out.println(timeZone);
        System.out.println(systemTimeZone); // Asia/Calcutta
        System.out.println(calendar.getTimeZone());



    }

    @Test
    public void getDateWithSpecifiedFormat(String format) {
        String language = "en";
        String country = "IN";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, new Locale(language, country));
        String formattedDate = simpleDateFormat.format(new Date());
        System.out.println(formattedDate);
    }

}
