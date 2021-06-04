package com.digite.kata.workflow;

public class SuperWorker implements Worker, HumanInterface{

    public String work() {
        return "working much more..";
    }

    public String eat() {
        //.... eating in launch break
        return "eating in lunch break..";
    }
}