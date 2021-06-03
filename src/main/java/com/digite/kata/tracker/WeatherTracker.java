package com.digite.kata.tracker;

import com.digite.kata.tracker.Emailer;
import com.digite.kata.tracker.Phone;

public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Emailer emailer;

    public WeatherTracker() {
        /*phone = new Phone();
        emailer = new Emailer();*/
    }

    public String setCurrentConditions(String weatherDescription, Notification w_notification) {
        
    	return w_notification.generateWeatherAlert(weatherDescription);
    }
}
