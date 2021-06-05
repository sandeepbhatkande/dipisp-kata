package com.digite.kata.workflow;

public class Manager {

    JuniorWorker m_juniorworker;

    public void setWorker(JuniorWorker worker) {
        this.m_juniorworker=worker;
    }

    public String manage() {
    	return m_juniorworker.work();
    }
}
