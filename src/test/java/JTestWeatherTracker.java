import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.digite.kata.tracker.Notification;
import com.digite.kata.tracker.Phone;
import com.digite.kata.tracker.WeatherTracker;

public class JTestWeatherTracker {
	
	@Test
	public void testRainyWeatherCondition() 
	{
		Notification a_notify = new Phone();
		WeatherTracker a_weatherTracker = new WeatherTracker();
		String w_msg = a_weatherTracker.setCurrentConditions("Rainy", a_notify);
		assertEquals(w_msg, "It is Rainy");
	}
	
	@Test
	public void testSunnyWeatherCondition() 
	{
		Notification a_notify = new Phone();
		WeatherTracker a_weatherTracker = new WeatherTracker();
		String w_msg = a_weatherTracker.setCurrentConditions("Sunny", a_notify);
		assertEquals(w_msg, "It is Sunny");
	}

}
