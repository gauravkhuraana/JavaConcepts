package DateTime;

import lombok.var;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
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

        final var clock = Clock.systemUTC();
        final var nowLocal = LocalDateTime.now(clock);
        System.out.println("The localdate using now.toInstant(ZoneOffset.UTC) " + nowLocal.toInstant(ZoneOffset.UTC)); // 2022-04-10


        System.out.println("LocalDateTime.now(ZoneOffset.UTC) = "+  LocalDateTime.now(ZoneOffset.UTC));
        System.out.println("LocalDateTime.now(ZoneOffset.UTC) = "+  LocalDateTime.now());

        DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy EEEE");
        System.out.println(" DateFormat dateFormat = new SimpleDateFormat('d MMMM yyyy EEEE');\n "+ dateFormat.toString());
    }

}
