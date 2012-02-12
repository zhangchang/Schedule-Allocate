/**
 * 
 */
package scheduleAllocate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author zhangchang
 * 
 */
public class WorkCalendar {

	private String calendarName = null;

	private Date calendarStartDay = null;

	private Date calendarEndDay = null;

	private ArrayList<Date> calendarHolidays = null;

	public WorkCalendar() throws ParseException {
		calendarStartDay = getDefaultStartDay();
		calendarEndDay = getDefaultEndDay();
		calendarHolidays = new ArrayList<Date>();

		Calendar calStartDay = dateToCalendar(calendarStartDay);
		Calendar calEndDay = dateToCalendar(calendarEndDay);

		while (calStartDay.compareTo(calEndDay) <= 0) {
			if ((calStartDay.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
					|| (calStartDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
				calendarHolidays.add(calStartDay.getTime());
			}
			calStartDay.add(Calendar.DAY_OF_MONTH, 1);
		}

	}

	private Calendar dateToCalendar(Date dt) {
		SimpleDateFormat df = new SimpleDateFormat(CommonConst.DATE_FORMAT);
		int year = Integer.parseInt(df.format(dt).substring(0, 4));
		int month = Integer.parseInt(df.format(dt).substring(4, 6)) - 1;
		int day = Integer.parseInt(df.format(dt).substring(6, 8));

		return new GregorianCalendar(year, month, day);
	}

	public ArrayList<Date> getCalendarHolidays() {
		return calendarHolidays;
	}

	private Date getDefaultEndDay() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(CommonConst.DATE_FORMAT);
		int startYear = Calendar.getInstance().get(Calendar.YEAR);
		return df.parse(String.valueOf(startYear + 5).concat("1231"));
	}

	private Date getDefaultStartDay() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(CommonConst.DATE_FORMAT);
		int startYear = Calendar.getInstance().get(Calendar.YEAR);
		return df.parse(String.valueOf(startYear - 5).concat("0101"));
	}

}
