package com.digite.kata.tracker;

public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Emailer emailer;

    public WeatherTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }

    public String setCurrentConditions(String weatherDescription, Notification a_notification) {
    	String w_condition = a_notification.generateWeatherAlert(weatherDescription);
    	return w_condition;
    }
}
