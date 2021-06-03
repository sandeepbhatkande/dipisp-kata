package com.digite.kata.workflow;

public class JuniorWorker implements Worker, HumanInterface{

    public String work() {
    	return "working";
    }
    public String eat() {
    	return "eating in lunch break";
    }
}
