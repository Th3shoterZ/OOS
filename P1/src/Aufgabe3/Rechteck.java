package Aufgabe3;

/*
 Eine Rechteck Klasse die von der Klasse Point Attrbute und co durch Aggregation erhält
 */

import Aufgabe3.Point;

public class Rechteck {
    // Attribute
    Point p; // hier obenLinks
    int h; // hoehe
    int b; // breite


    // Konstruktoren:

    /**
     * Default-Konstruktor:
     */

    Rechteck() {
    }

    /**
     * Erzeugung und Setzen der Attributwerte auf die Attributwerte des Parameterobjekts von Point
     * und einem Parameterwertes:
     * @param p
     */

    Rechteck(Point p, int h, int b) {
        this.p = p; // konstruktor von Point aufrufen
        this.h = h;
        this.b = b;
    }

    /**
     * Erzeugen und Setzen der Attribute auf die Attribute des Parameterobjektes:
     * @param r
     */
    Rechteck(Rechteck r) {
        this.p = r.p;
        this.h = r.h;
        this.b = r.b;
    }

    /**
     * Erzeugung und Setzen der Attributwerte auf die Parameterwerte:
     */

    Rechteck(int x, int y, int h, int b) {
        this.p = new Point(x,y); // konstruktor von Point aufrufen
        this.h = h;
        this.b = b;
    }
//Methoden:

    /**
     * Erzeugen eines neuen Kreises mit den gleichen Attributwerten wie des
     * aktuellen Objekts:
     * Unterschied zu Konstruktor ist anderer Aufrufmechanismus, analog zu
     * clone()
     */

    Rechteck getLocation() {
        return (new Rechteck(this));
    }

    /**
     * Setzen der Attributwerte auf die Attributwerte des Parameterobjekts:
     * @param r liefert den Referenzpunkt
     */

    void setLocation(Rechteck r) {
        this.p = r.p;
        this.h = r.h;
        this.b = r.b;
    }

    /**
     * Setzen der Attributwerte auf die Parameterwerte:
     */

    void setLocation(int x, int y, int h, int b) {
        this.p = new Point(x,y);
        this.h = h;
        this.b = b;
    }


    /**
     * Standardmethode equals:
     */

    public boolean equals(Rechteck r) {
        return ((this.p == r.p) && (this.h == r.h) && (this.b == r.b));
    }


    /**
     * Standardmethode liefert folgende Ausgabe (x,y):
     */

    public String toString() {
        return ("(" + this.p + ","+ this.h + "," + this.b + ")");
    }

    /**
     * Methode clone soll eine Kopie in einem neuen Objekt erstellen
     */
    Rechteck clone(Rechteck r) {
        return (new Rechteck(this));
    }

    /**
     * Flächenberechnung
     */
    double getFlaecheninhalt() {
       return (this.h * this.b);
    }

}
