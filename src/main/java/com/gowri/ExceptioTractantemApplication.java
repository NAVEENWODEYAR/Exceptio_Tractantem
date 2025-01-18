package com.gowri;

import java.text.SimpleDateFormat;
import java.util.Date;

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
		log.info("##/nCRON JOB/n##");
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        log.warn("[{}] Application started: {}", timestamp);
	}

}
