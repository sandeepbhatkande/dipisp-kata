package workflow;

import com.digite.kata.workflow.RobotWorker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JTestRobotWorker {
    static RobotWorker w_rw;

    @BeforeAll
    public static void setup() {
        w_rw = new RobotWorker();
    }

    @Test
    public void testwork() {
        assertEquals("RoboWork", w_rw.work());
    }

    @Test
    public void testEat() {
        assertEquals("SuperEat", w_rw.eat());
    }
}
