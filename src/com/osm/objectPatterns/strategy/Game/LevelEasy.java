package com.osm.objectPatterns.strategy.Game;

public class LevelEasy implements LevelStrategy{
    @Override
    public void execute() {
        System.out.println("Changing level game to 'Easy'");
    }
}
