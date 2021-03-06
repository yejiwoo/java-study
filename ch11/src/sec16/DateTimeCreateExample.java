package sec16;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) {

		LocalDate currDate=LocalDate.now();
		System.out.println("LocalDate.now(): "+currDate);
		
		LocalDate targetDate=LocalDate.of(2024, 5, 10);
		System.out.println("LocalDate.of(): "+targetDate);
		
		//협정 세계시와 시간존
		ZonedDateTime localDateTime=ZonedDateTime.now();
		System.out.println("ZonedDateTime.now(): "+localDateTime);
		
		ZonedDateTime utcDateTime=ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("ZonedDateTime.now(ZoneId.of(\"UTC\"): "+utcDateTime);
		
		//특정시점의 타임스탬프 얻기
		Instant instant1=Instant.now();
		try {
		Thread.sleep(10);
		}catch(InterruptedException e) {
			System.out.println("InterruptedException");
		}
		Instant instant2=Instant.now();
		if(instant1.isBefore(instant2)) System.out.println("instant1이 빠릅니다.");
		else if(instant2.isAfter(instant2)) System.out.println("instant1이 느립니다");
		else System.out.println("동일한 시간입니다");
		
		System.out.println("차이(nanos): "+ instant1.until(instant2, ChronoUnit.NANOS));
		
	}

}
