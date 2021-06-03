import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.digite.kata.workflow.HumanInterface;
import com.digite.kata.workflow.JuniorWorker;
import com.digite.kata.workflow.Manager;
import com.digite.kata.workflow.RobotWorker;
import com.digite.kata.workflow.SuperWorker;
import com.digite.kata.workflow.Worker;

public class JTestManager {

    @Test
    public void testJuniorWorkerWork()
    {
        Worker w_juniorWorker = new JuniorWorker();
        Manager w_manager = new Manager();
        w_manager.setWorker(w_juniorWorker);
        assertEquals(w_manager.manageWork(), "working");
    }

    @Test
    public void testJuniorWorkerEat()
    {
        HumanInterface w_juniorWorker = new JuniorWorker();
        Manager w_manager = new Manager();
        w_manager.setHuman(w_juniorWorker);
        assertEquals(w_manager.manageLunchBreak(), "eating in lunch break");
    }

    @Test
    public void testRobotWorkerWork()
    {
        Worker w_robotWorker = new RobotWorker();
        Manager w_manager = new Manager();
        w_manager.setWorker(w_robotWorker);
        assertEquals(w_manager.manageWork(), " BOT working");
    }

    @Test
    public void testSuperWorkerWork()
    {
        Worker w_superWorker = new SuperWorker();
        Manager w_manager = new Manager();
        w_manager.setWorker(w_superWorker);
        assertEquals(w_manager.manageWork(), "working much more");
    }

    @Test
    public void testSuperWorkerEat()
    {
        HumanInterface w_superWorker = new SuperWorker();
        Manager w_manager = new Manager();
        w_manager.setHuman(w_superWorker);
        assertEquals(w_manager.manageLunchBreak(), "eating in lunch break");
    }
}
