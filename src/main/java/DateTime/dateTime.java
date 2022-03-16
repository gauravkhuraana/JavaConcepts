package DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class dateTime {

    public static void main(String[] args) {

        final String timeStamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(Calendar.getInstance().getTime());
        final String startTimeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println("The date time is "+timeStamp);
        System.out.println("The date time is "+startTimeStamp);



    }
}
