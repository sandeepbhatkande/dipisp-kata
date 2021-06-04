package com.digite.kata.tracker;

public class Emailer implements Notification {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
