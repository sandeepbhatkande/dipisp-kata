package com.digite.kata.workflow;

public class JuniorWorker implements Worker, HumanInterface
{
    public String work() {
        // ....working
       return "working";
    }
    public String eat() {
        // ...... eating in lunch break
        return "eating in lunch break";
    }
}