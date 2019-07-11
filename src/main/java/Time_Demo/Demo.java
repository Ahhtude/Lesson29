package Time_Demo;

import TImeTask.TimeParts.Month;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalField;

public class Demo {
    public static void main(String[] args) {
        Month month =new Month(2019,5,19);
        System.out.println(month.getDate().toString());


    }
}
