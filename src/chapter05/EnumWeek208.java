package chapter05;

import java.util.Calendar;

public class EnumWeek208 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int week = cal.get(cal.DAY_OF_WEEK);
		
		Week today = null;
		
		switch(week) {
		case 1:
			today = Week.sunday; break;
		case 2:
			today = Week.monday; break;
		case 3:
			today = Week.tuesday; break;
		case 4:
			today = Week.wednesday; break;
		case 5:
			today = Week.thursday; break;
		case 6:
			today = Week.friday; break;
		case 7:
			today = Week.saturday; break;
		}
		
		System.out.println("오늘 요일: " + today);

		if (today == Week.sunday) {
			System.out.println("일요일에는 축구를 합니다");
		} else {
			System.out.println("열심히 자바 공부 합니다");
		}
		System.out.println(today.ordinal());
		System.out.println(today.name());
	}
}
