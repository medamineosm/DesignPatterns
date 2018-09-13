package com.osm.objectPatterns.strategy.Game;

public class LevelHard implements LevelStrategy{
    @Override
    public void execute() {
        System.out.println("Changing level game to 'Hard'");
    }
}
