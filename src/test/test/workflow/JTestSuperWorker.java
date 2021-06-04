package workflow;

import com.digite.kata.workflow.SuperWorker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JTestSuperWorker {
    static SuperWorker w_sw;
    @BeforeAll
    public static void setup() {
        w_sw = new SuperWorker();
    }

    @Test
    public void testwork() {
        assertEquals("SuperWork", w_sw.work());
    }

    @Test
    public void testEat() {
        assertEquals("SuperEat", w_sw.eat());
    }
}
