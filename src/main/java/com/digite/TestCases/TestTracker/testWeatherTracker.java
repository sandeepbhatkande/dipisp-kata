package com.digite.TestCases.TestTracker;
import static org.junit.Assert.assertEquals;

import org.junit.*;
import com.digite.kata.tracker.*;

public class testWeatherTracker {
	
	@Test
	public void testWeather() {
		Emailer w_email = new Emailer();
		Phone w_phone = new Phone();
		WeatherTracker w_weather1 = new WeatherTracker(w_email);
		WeatherTracker w_weather2 = new WeatherTracker(w_phone);
		String w_update1 = "Raining";
		String w_update2 = "Cold";
		assertEquals(w_weather1.sendNotification(w_update1), "INBOX: It is Raining");
		assertEquals(w_weather2.sendNotification(w_update2), "SMS: It is Cold");
	}
	

}
