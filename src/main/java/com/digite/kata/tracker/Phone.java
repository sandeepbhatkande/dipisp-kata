package com.digite.kata.tracker;

public class Phone implements Notification{
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "SMS: It is " + weatherConditions;
        return alert;
    }
}
