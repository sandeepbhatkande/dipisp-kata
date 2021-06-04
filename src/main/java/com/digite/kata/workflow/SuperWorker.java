package com.digite.kata.workflow;

public class SuperWorker implements Worker, LivingBeing{

    public String work() {
        return "SuperWork";
    }

    public String eat() {
        return "SuperEat";
    }
}
