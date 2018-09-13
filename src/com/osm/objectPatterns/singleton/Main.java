package com.osm.objectPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        // Il ne faut pas copier un singleton dans une variable locale sauf dans les cas d'optimisations extrêmes.
        Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();
        //on doit avoir une seule initialisation
    }
}
