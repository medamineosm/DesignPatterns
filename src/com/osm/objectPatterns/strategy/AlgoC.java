package com.osm.objectPatterns.strategy;

public class AlgoC implements IStrategy {
    @Override
    public void execute() {
        System.out.println(" execution of " + this.getClass().getSimpleName());
    }
}