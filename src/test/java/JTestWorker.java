import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.digite.kata.workflow.HumanInterface;
import com.digite.kata.workflow.JuniorWorker;
import com.digite.kata.workflow.Manager;
import com.digite.kata.workflow.RobotWorker;
import com.digite.kata.workflow.SuperWorker;
import com.digite.kata.workflow.Worker;

public class JTestWorker
{
    @Test
    public void testJuniorWorkerWorking()
    {
        Worker w_juniorWorker = new JuniorWorker();
        Manager w_manager = new Manager();
        w_manager.setWorker(w_juniorWorker);
        assertEquals(w_manager.manageWork(), "working..");
    }

    @Test
    public void testJuniorWorkerEating()
    {
        HumanInterface w_juniorWorker = new JuniorWorker();
        Manager w_manager = new Manager();
        w_manager.setHuman(w_juniorWorker);
        assertEquals(w_manager.manageLunchBreak(), "eating in lunch break..");
    }

    @Test
    public void testSuperWorkerWorking()
    {
        Worker w_superWorker = new SuperWorker();
        Manager w_manager = new Manager();
        w_manager.setWorker(w_superWorker);
        assertEquals(w_manager.manageWork(), "working much more..");
    }

    @Test
    public void testSuperWorkerEating()
    {
        HumanInterface w_superWorker = new SuperWorker();
        Manager w_manager = new Manager();
        w_manager.setHuman(w_superWorker);
        assertEquals(w_manager.manageLunchBreak(), "eating in lunch break..");
    }
    
    @Test
    public void testRobotWorkerWorking()
    {
        Worker w_robotWorker = new RobotWorker();
        Manager w_manager = new Manager();
        w_manager.setWorker(w_robotWorker);
        assertEquals(w_manager.manageWork(), "BOT working..");
    }
} 
