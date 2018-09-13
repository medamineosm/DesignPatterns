package com.osm.objectPatterns.singleton;

public final class Singleton {

    // L'utilisation du mot clé volatile, en Java version 5 et supérieure,
    // permet d'éviter le cas où "Singleton.instance" est non nul,
    // mais pas encore "réellement" instancié.
    private static volatile Singleton instance = null;

    // La présence d'un constructeur privé supprime le constructeur public par défaut.
    // De plus, seul le singleton peut s'instancier lui-même.
    private Singleton(){
        super();
    }
    public final static Singleton getInstance(){
        if(Singleton.instance == null){
            // Le mot-clé synchronized sur ce bloc empêche toute instanciation
            // multiple même par différents "threads".
            // Il est TRES important.
            synchronized (Singleton.class){
                if(Singleton.instance == null){
                    System.out.println("Initialization");
                    Singleton.instance = new Singleton();
                }
            }
        }
        return Singleton.instance;
    }
}
