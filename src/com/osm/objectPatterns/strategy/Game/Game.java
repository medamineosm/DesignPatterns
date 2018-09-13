package com.osm.objectPatterns.strategy.Game;

public class Game {

    public static void main(String[] args) {
        Party party = new Party();
        party.changeLevel(new LevelHard());
        party.changeLevel(new LevelNormal());
        party.changeLevel(new LevelEasy());
    }
}
