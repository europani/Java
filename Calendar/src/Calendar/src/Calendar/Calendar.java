package Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Calendar {

	private static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	private HashMap<Date, String> planMap;
	
	public Calendar() {
		planMap = new HashMap<Date, String>();
	}

	public void savePlan(String strDate, String plan) {
		Date date=null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd"). parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		planMap.put(date, plan);
	}
	
	public String searchPlan(String strDate) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd"). parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String plan = planMap.get(date);
		return "" ;
	}
	
	public  void leapFeb(int year) {
		if (year %4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
			MAX_DAYS[1]=29;
		}
	}
	
	public void printCalendar(int year, int month) {
		System.out.printf("%d년 %d월 \n", year, month);
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("----------------------------");

		leapFeb(year);
		
		int maxDay = maxDayOfMonth(month);
		

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%4d", i);

			if (i % 7 == 0) {
				System.out.println("");
			}
		}

		System.out.println("");
	}

	public int maxDayOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

}
