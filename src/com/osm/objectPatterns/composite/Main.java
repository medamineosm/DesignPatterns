package com.osm.objectPatterns.composite;

public class Main {
    public static void main(String[] args) {
        //Initialise quatre ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();
        Cercle cercle1 = new Cercle();

        //Initialise trois graphiques composites
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Composes les graphiques
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);
        graphic2.add(cercle1);

        graphic.add(graphic1);
        graphic.add(graphic2);

        //Imprime le graphique complet (quatre fois la chaîne "Ellipse" et une fois "Cercle").
        graphic.print();
    }
}
