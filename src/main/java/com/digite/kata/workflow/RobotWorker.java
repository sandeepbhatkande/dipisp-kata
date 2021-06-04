package com.digite.kata.workflow;

public class RobotWorker implements Worker{

    public String work() {
        return "RoboWork";
    }

    public String eat() {
        throw new RuntimeException();
    }
}
