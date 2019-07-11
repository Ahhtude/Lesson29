package Time_Demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateInfoProvider {
    public static void main(String[] args) {
        Date date;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,6,1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2019,8,1);
        TimeZone tz;
        //Arrays.stream(TimeZone.getAvailableIDs())
        //        .forEach(System.out::println);

        Date d = new Date();

        System.out.println(calendar.getTime());
        calendar.get(Calendar.YEAR);

        //последний день месяца
        calendar.add(Calendar.MONTH,1);
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        //2019-07-31
        System.out.println("last day is " + calendar.get(Calendar.DAY_OF_MONTH));

        //datediff
        System.out.println("Datediff is - " + (calendar.getTime().getTime()-calendar2.getTime().getTime())/ (1000*60*60*24));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        System.out.println("Formated date - " + sdf.format(calendar.getTime()));




    }

}
