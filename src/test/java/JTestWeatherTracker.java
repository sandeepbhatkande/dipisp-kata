import static org.junit.Assert.*;
import org.junit.Test;
import com.digite.kata.tracker.Emailer;
import com.digite.kata.tracker.Notification;
import com.digite.kata.tracker.Phone;
import com.digite.kata.tracker.WeatherTracker;

public class JTestWeatherTracker {

	@Test
	public void testRainyCondition()
	{
		Notification w_Notification = new Phone();
		WeatherTracker w_WeatherTracker =  new WeatherTracker();
		assertEquals(w_WeatherTracker.setCurrentConditions("rainy", w_Notification), "from phone file: rainy");
	}
	
	@Test
	public void testSunnyCondition()
	{
		Notification w_Notification = new Emailer();
		WeatherTracker w_WeatherTracker =  new WeatherTracker();
		assertEquals(w_WeatherTracker.setCurrentConditions("sunny", w_Notification), "from Emailer file: sunny");
	}
}
