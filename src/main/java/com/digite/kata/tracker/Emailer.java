package com.digite.kata.tracker;

public class Emailer implements Notification 
{
	 public String generateWeatherAlert(String weatherConditions) {
	        String alert = "from Emailer file: " + weatherConditions;
	        return alert;
	    }
}
