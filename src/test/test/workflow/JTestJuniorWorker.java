package workflow;

import com.digite.kata.workflow.JuniorWorker;
import com.digite.kata.workflow.SuperWorker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JTestJuniorWorker {
    static JuniorWorker w_jw;
    @BeforeAll
    public static void setup() {
        w_jw = new JuniorWorker();
    }

    @Test
    public void testwork() {
        assertEquals("JuniorWork", w_jw.work());
    }

    @Test
    public void testEat() {
        assertEquals("JuniorEat", w_jw.eat());
    }
}
