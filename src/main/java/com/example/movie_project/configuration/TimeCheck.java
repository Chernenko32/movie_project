package com.example.movie_project.configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.movie_project.repository.CustomerDao;

@Component
public class TimeCheck {

	@Autowired
	private CustomerDao customerDao;

	@Scheduled(fixedRate = 20000)
	public void timeCheck() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime time = LocalDateTime.now().minusMinutes(1);
		customerDao.updateStatus(dateFormat.format(time));
	}
}
