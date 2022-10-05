package com.spring.empolyee.model;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MydbHealthService implements HealthIndicator {

	public static final String DB_SERVICE="Database Service";
	public boolean healthCheck()
	{
		return true;
	}
	
	@Override
	public Health health() {
		if(healthCheck()==true)
		{
			return Health.up().withDetail(DB_SERVICE, "Database service is running!").build();
		}
		return Health.down().withDetail(DB_SERVICE,"Database service is running!").build();
	}
	
	

}
