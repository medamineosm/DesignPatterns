package com.osm.objectPatterns.strategy;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Element element = new Element();
        ALGO_TYPE state = ALGO_TYPE.values()[ThreadLocalRandom.current().nextInt(0, ALGO_TYPE.values().length)];

        switch (state){
            case A:
                element.changeStrategy(new AlgoA());break;
            case B:
                element.changeStrategy(new AlgoB());break;
            case C:
                element.changeStrategy(new AlgoC());break;
        }

        element.goStrategy();
    }
}
