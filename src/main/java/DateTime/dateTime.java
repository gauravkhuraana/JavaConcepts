package DateTime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;

public class dateTime {

    public static void main(String[] args) {

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

    }
}
