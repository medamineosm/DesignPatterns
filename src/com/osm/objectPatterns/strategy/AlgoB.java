package com.osm.objectPatterns.strategy;

public class AlgoB implements IStrategy {
    @Override
    public void execute() {
        System.out.println(" execution of " + this.getClass().getSimpleName());
    }
}
