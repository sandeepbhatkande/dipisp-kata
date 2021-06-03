package com.digite.kata.tracker;

import com.digite.kata.tracker.Emailer;
import com.digite.kata.tracker.Phone;

public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Emailer emailer;

    /*public WeatherTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }*/

    public String setCurrentConditions(String weatherDescription, Notification a_notification) {

        return a_notification.generateWeatherAlert(weatherDescription);

        /*if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }*/

    }
}
