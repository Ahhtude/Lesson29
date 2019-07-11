package TImeTask;

import TImeTask.CalendarExceptions.InvalidDayInYearException;
import TImeTask.CalendarExceptions.InvalidFiscalDateFormatException;
import TImeTask.Calendars_interfaces.ICalendarInputValidator;
import TImeTask.Calendars_interfaces.ICalendarProvider;
import TImeTask.TimeParts.Month;

import java.util.List;

public class TimeDemo implements ICalendarProvider,ICalendarInputValidator{
    public TimeDemo() {

    }

    @Override
    public List<Month> getMonthes(int fiscalDateFrom, int fiscalDateTo) throws InvalidFiscalDateFormatException {




        return null;
    }

    @Override
    public Month getDayInfo(int year, int dayInYear) throws InvalidDayInYearException {



        return null;
    }

    @Override
    public List<String> getMonthesFormatted(int fiscalDateFrom, int fiscalDateTo) throws InvalidFiscalDateFormatException {
        return null;
    }
}
