package com.osm.objectPatterns.strategy.Game;

public class LevelNormal implements LevelStrategy{
    @Override
    public void execute() {
        System.out.println("Changing level game to 'Normal'");
    }
}
