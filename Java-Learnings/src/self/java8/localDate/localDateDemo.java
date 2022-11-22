package self.java8.localDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class localDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		ZoneId.getAvailableZoneIds().stream().sorted().filter(zoneId -> zoneId.contains("Asia")).forEach(System.out::println);
		
		LocalTime time = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(time);

	}

}
