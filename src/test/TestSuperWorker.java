import com.digite.kata.workflow.SuperWorker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSuperWorker
{
    @Test
    public void testWork()
    {
        SuperWorker w_sw = new SuperWorker();
        Assertions.assertEquals(w_sw.work(), "working much more");
    }

    @Test
    public void testEat()
    {
        SuperWorker w_sw = new SuperWorker();
        Assertions.assertEquals(w_sw.eat(), "eating in lunch break");
    }
}
