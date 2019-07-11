package TImeTask.TimeParts;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Month {
    private LocalDate date;
    private String name;
    private int num;
    private int year;
    private List<Day> days;

    public Month() {
    }

    public LocalDate getDate() {
        return date;
    }

    public Month(int year, int month, int day) {
        this.days = new ArrayList<>(day);
        date = LocalDate.of(year,month,day);
        this.name = date.getMonth().toString();
        this.num = date.getMonthValue();
        this.year = date.getYear();
        for (int i=0; i<day;i++){
            days.add(new Day(i));
        }
    }

    public Month(int year, int month) {
        date=LocalDate.of(year,month,1);
        this.name = date.getMonth().toString();
        this.num = date.getMonthValue();
        this.year = date.getYear();
        this.days = new ArrayList<Day>(date.getMonth().length(true));
        for (int i=0; i<date.getMonth().length(true);i++){
            days.add(new Day(i));
        }

    }

    public List<Day> getDays() {
        return days;
    }
}
