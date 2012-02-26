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

	/**
	 * 默认构造函数
	 * 
	 * @throws ParseException
	 */
	public WorkCalendar() throws ParseException {
		this.setCalendarName(CommonConst.DEFAULT_CALENDAR_NAME);
		this.setCalendarStartDay(defaultStartDay());
		this.setCalendarEndDay(defaultEndDay());
		ArrayList<Date> holidays = new ArrayList<Date>();

		Calendar calStartDay = dateToCalendar(this.getCalendarStartDay());
		Calendar calEndDay = dateToCalendar(this.getCalendarEndDay());

		while (calStartDay.compareTo(calEndDay) <= 0) {
			if ((calStartDay.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
					|| (calStartDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
				holidays.add(calStartDay.getTime());
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

	/**
	 * 返回CommonConst.DEFAULT_YEARS年后的12月31日
	 * 
	 * @return 日历结束日期
	 * @throws ParseException
	 */
	private Date defaultEndDay() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(CommonConst.DATE_FORMAT);
		int startYear = Calendar.getInstance().get(Calendar.YEAR);
		return df.parse(String.valueOf(startYear + CommonConst.DEFAULT_YEARS).concat("1231"));
	}

	/**
	 * 返回CommonConst.DEFAULT_YEARS年前的1月1日
	 * 
	 * @return 日历开始日期
	 * @throws ParseException
	 */
	private Date defaultStartDay() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(CommonConst.DATE_FORMAT);
		int startYear = Calendar.getInstance().get(Calendar.YEAR);
		return df.parse(String.valueOf(startYear - CommonConst.DEFAULT_YEARS).concat("0101"));
	}

	public Date getCalendarEndDay() {
		return calendarEndDay;
	}

	public ArrayList<Date> getCalendarHolidays() {
		return calendarHolidays;
	}

	public String getCalendarName() {
		return calendarName;
	}

	public Date getCalendarStartDay() {
		return calendarStartDay;
	}

	public void setCalendarEndDay(Date calendarEndDay) {
		this.calendarEndDay = calendarEndDay;
	}

	public void setCalendarHolidays(ArrayList<Date> calendarHolidays) {
		this.calendarHolidays = calendarHolidays;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}

	public void setCalendarStartDay(Date calendarStartDay) {
		this.calendarStartDay = calendarStartDay;
	}

}
