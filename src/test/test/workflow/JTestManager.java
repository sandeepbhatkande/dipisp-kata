package workflow;

import com.digite.kata.workflow.Manager;
import com.digite.kata.workflow.SuperWorker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JTestManager {
    static SuperWorker w_sw;
    @BeforeAll
    public static void setup() {
        w_sw = new SuperWorker();
    }

    @Test
    public void testmanage() {
        Manager w_manage = new Manager();
        w_manage.setWorker(w_sw);

        assertEquals("SuperWork", w_manage.manage());
    }
}
