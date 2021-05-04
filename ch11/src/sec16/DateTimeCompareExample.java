package sec16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {

		LocalDate startDate=LocalDate.of(2023, 1,1);
		System.out.println("시작일: "+startDate);
		
		LocalDate endDate=LocalDate.of(2024,3,31);
		System.out.println("종료일: "+endDate+"\n");
		
		if(startDate.isBefore(endDate)) System.out.println("진행 중입니다.\n");
		else if(startDate.isEqual(endDate)) System.out.println("종료합니다.\n");
		else if(startDate.isAfter(endDate)) System.out.println("종료했습니다.\n");
		
		System.out.println("[종료까지 남은 시간]");
		long remainYear=startDate.until(endDate, ChronoUnit.YEARS);
		long remainMonth = startDate.until(endDate, ChronoUnit.MONTHS);
		long remainDay = startDate.until(endDate, ChronoUnit.DAYS);
		
		System.out.println(remainYear);
		System.out.println(remainMonth);
		System.out.println(remainDay);
		
		remainYear=ChronoUnit.YEARS.between(startDate, endDate);
		remainMonth=ChronoUnit.MONTHS.between(startDate, endDate);
		remainDay=ChronoUnit.DAYS.between(startDate, endDate);
		
		System.out.println("남은 해: "+remainYear);
		System.out.println("남은 달: "+remainMonth);
		System.out.println("남은 일: "+remainDay);
		
		System.out.println("[종료까지 남은 기간]");
		Period period=Period.between(startDate, endDate);
		System.out.println(period);
		System.out.print("남은기간: "+period.getYears()+"년 ");
		System.out.print(period.getMonths()+"달 ");
		System.out.print(period.getDays()+"일");
	}

}
