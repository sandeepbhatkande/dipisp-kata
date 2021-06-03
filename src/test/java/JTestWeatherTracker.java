import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.digite.kata.tracker.Emailer;
import com.digite.kata.tracker.Notification;
import com.digite.kata.tracker.Phone;
import com.digite.kata.tracker.WeatherTracker;

public class JTestWeatherTracker
{
    @Test
    public void testCurrentConditionsinRainyCase()
    {
        Notification a_notification = new Phone();
        WeatherTracker w_tracker = new WeatherTracker();
        Assertions.assertEquals(w_tracker.setCurrentConditions("rainy", a_notification),"from phone :It is rainy");
    }

    @Test
    public void testCurrentConditionsinSunnyCase()
    {
        Notification a_notification = new Emailer();
        WeatherTracker w_tracker = new WeatherTracker();
        Assertions.assertEquals(w_tracker.setCurrentConditions("sunny", a_notification),"from email : It is sunny");
    }


}