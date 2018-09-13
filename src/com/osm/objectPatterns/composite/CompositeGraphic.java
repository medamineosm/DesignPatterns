package com.osm.objectPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{

    //Collection de graphiques enfants.
    private List<Graphic> childGraphics = new ArrayList<>();

    //Imprime le graphique.
    @Override
    public void print() {
        this.childGraphics.forEach(Graphic::print);
    }

    public void add(Graphic graphic){
        this.childGraphics.add(graphic);
    }

    public void remove(Graphic graphic){
        this.childGraphics.remove(graphic);
    }
}
