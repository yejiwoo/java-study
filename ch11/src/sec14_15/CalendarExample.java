package sec14_15;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
	public static void main(String args[]) {
		TimeZone timeZone=TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now= Calendar.getInstance(timeZone);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek=null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek="월"; break;
		case Calendar.TUESDAY:
			strWeek="화"; break;
		case Calendar.WEDNESDAY:
			strWeek="수";break;
		case Calendar.THURSDAY:
			strWeek="목";break;
		case Calendar.FRIDAY:
			strWeek="금";break;
		case Calendar.SATURDAY:
			strWeek="토";break;
		case Calendar.SUNDAY:
			strWeek="일";break;
		}
		
		int amPm=now.get(Calendar.AM_PM);
		String strAmPm=null;
		switch(amPm) {
		case Calendar.AM: strAmPm="오전";break;
		case Calendar.PM: strAmPm="오후";break;
		}
		
		int hour=now.get(Calendar.HOUR);
		int minute= now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(strWeek);
		System.out.println(strAmPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}
}
