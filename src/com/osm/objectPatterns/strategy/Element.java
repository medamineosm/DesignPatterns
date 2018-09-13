package com.osm.objectPatterns.strategy;

public class Element {
    private IStrategy iStrategy;


    public void changeStrategy(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void goStrategy(){
        this.iStrategy.execute();
    }
}
