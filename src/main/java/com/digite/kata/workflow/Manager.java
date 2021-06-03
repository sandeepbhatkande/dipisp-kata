package com.digite.kata.workflow;

public class Manager {

    Worker worker;
    HumanInterface w_human;

    public void setWorker(Worker worker) {
        this.worker=worker;
    }
    
    public void setHuman(HumanInterface a_human) {
        this.w_human = a_human;
     }
    
    public String manageWork() {
    	return worker.work();
    }
    
    public String manageLunchBreak() {
        return w_human.eat();
    }
}
