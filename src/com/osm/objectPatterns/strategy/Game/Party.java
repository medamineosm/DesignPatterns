package com.osm.objectPatterns.strategy.Game;

public class Party {
    private LevelStrategy levelStrategy;

    public Party(){
        this.levelStrategy = new LevelEasy();
    }

    public void changeLevel(LevelStrategy levelStrategy){
        this.levelStrategy = levelStrategy;
        this.levelStrategy.execute();
    }
}
