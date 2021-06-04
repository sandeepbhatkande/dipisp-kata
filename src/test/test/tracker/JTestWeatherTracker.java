package tracker;

import com.digite.kata.tracker.Emailer;
import com.digite.kata.tracker.Notification;
import com.digite.kata.tracker.Phone;
import com.digite.kata.tracker.WeatherTracker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JTestWeatherTracker {
    static WeatherTracker w_tracker;

    @BeforeAll
    public static void setup () {
        w_tracker = new WeatherTracker();
    }


    @Test
    public void testCurrentConditions_rainy()
    {
        Notification notification = new Phone();
        assertEquals(w_tracker.setCurrentConditions("rainy", notification),"It is rainy");
    }

    @Test
    public void testCurrentConditionsin_sunny()
    {
        Notification notification = new Emailer();
        assertEquals(w_tracker.setCurrentConditions("sunny", notification),"It is sunny");
    }

}
