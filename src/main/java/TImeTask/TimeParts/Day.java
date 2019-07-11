package TImeTask.TimeParts;

import java.time.LocalDate;

public class Day extends Month{
    private int numInWeek;
    private int numInmonth;
    private String name;

    public Day(Integer numInmonth) {
    this.name = super.getDate().getDayOfWeek().toString();
    this.numInWeek = super.getDate().getDayOfWeek().getValue();
    this.numInmonth = super.getDate().getDayOfMonth();
    }
    public Day()
    {
    }
    
}
