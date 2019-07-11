package TImeTask.Calendars_interfaces;

import TImeTask.CalendarExceptions.InvalidDayInYearException;
import TImeTask.CalendarExceptions.InvalidFiscalDateFormatException;
import TImeTask.TimeParts.Month;

import java.util.List;

public interface ICalendarProvider {

    List<Month> getMonthes(int fiscalDateFrom, int fiscalDateTo) throws InvalidFiscalDateFormatException;

    Month getDayInfo(int year, int dayInYear) throws InvalidDayInYearException;

    List<String> getMonthesFormatted(int fiscalDateFrom, int fiscalDateTo) throws InvalidFiscalDateFormatException;
}

