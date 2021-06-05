package com.digite.kata.tracker;

import com.digite.kata.tracker.Emailer;
import com.digite.kata.tracker.Phone;

public class WeatherTracker {
    String currentConditions;
    Notification m_notifier;

    public WeatherTracker(Notification a_notifier) {
    	m_notifier = a_notifier;
    }

    public String sendNotification(String a_weatherDescription) {
        return m_notifier.generateWeatherAlert(a_weatherDescription);
    }
}
