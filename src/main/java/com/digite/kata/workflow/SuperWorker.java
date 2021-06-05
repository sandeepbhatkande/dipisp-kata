package com.digite.kata.workflow;

public class SuperWorker implements Worker, Eater{

    public String work() {
    	return "SUPER WORER WORKING";
    }

    public String eat() {
    	return "SUPER WORER EATING";
    }
}
