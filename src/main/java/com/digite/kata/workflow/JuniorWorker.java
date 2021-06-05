package com.digite.kata.workflow;

public class JuniorWorker implements Worker, Eater{

    public String work() {
        return "JUNIOR WORKING";
    }
    public String eat() {
    	  return "JUNIOR EATING";
    }
}
