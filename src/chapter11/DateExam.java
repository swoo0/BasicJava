package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		//옛날 방식
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	
		//최근 방식
		System.out.println(LocalDate.now());
		String date3 = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초"));
		System.out.println(date3);
		System.out.println(dateTime);
	}
	
}
