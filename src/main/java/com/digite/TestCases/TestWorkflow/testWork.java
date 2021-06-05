package com.digite.TestCases.TestWorkflow;
import com.digite.kata.workflow.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class testWork {

	@Test
	public void testWorker() {
		
		RobotWorker w_rw = new RobotWorker();
		Manager w_manager = new Manager();
		SuperWorker w_sw = new SuperWorker();
		assertEquals(w_rw.work(), "ROBOT WORKING");
		assertEquals(w_sw.work(), "SUPER WORER WORKING");
		assertEquals(w_sw.eat(), "SUPER WORER EATING");
		assertEquals(w_manager.manage(), "JUNIOR WORKING");
	}
}
