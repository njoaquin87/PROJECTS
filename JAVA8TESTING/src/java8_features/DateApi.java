package java8_features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateApi {

	public static void main(String[] args) {
	
		LocalDate today = LocalDate.now();
		System.out.println("Current Date = " + today);
		 
		LocalDate todayNewYork = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println("Current Date in America = " + todayNewYork);
		 
		// Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time = " + time);
		 
		LocalTime timeNewYork = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current Time in America = " + timeNewYork);
		 
		// Current Date
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current DateTime = " + now);
		 
		System.out.println(now.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss")));
	}

}
