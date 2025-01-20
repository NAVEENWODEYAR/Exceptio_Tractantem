package com.gowri;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ExceptioTractantemApplication {

	private static final Logger log = LoggerFactory.getLogger(ExceptioTractantemApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ExceptioTractantemApplication.class, args);
		log.warn("####");
	}
	
	@Scheduled(cron = "0 0/4 * * * ?")
	public void appInfo() {
		
		 Integer currentHour = LocalDateTime.now().getHour();

	        // Determine the greeting based on the time of day
	        String greeting = switch (currentHour) {
	            case 6, 7, 8, 9, 10, 11 -> "Good Morning";
	            case 12, 13, 14, 15, 16, 17 -> "Good Afternoon";
	            case 18, 19, 20 -> "Good Evening";
	            default -> "Good Night";  // For hours 21-5
	        };

	        // Format the timestamp using DateTimeFormatter (Java 8+)
	        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

	        // Log the greeting with the timestamp
	        log.warn("[{}] {}", timestamp, greeting);
	    }

}
