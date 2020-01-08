package Aufgabe2;

/*
Eine Kreis Klasse die Attribute und co von der Klasse Point erbt
 */


import Aufgabe2.Point;

/** ansich braucht man alle methoden und attribute der Klasse "Aufgabe2.Point",
 *  da ein Kreis eig. ja nur ein punkt mit mehr
 *  Inhalt ist und daher vllt nur noch ein attribut "durchmesser" vertragen könnte
*/
public class KreisVererb extends Point {

    // Attribute
    int r; // radius

    // Konstruktoren:

    /**
     * Default-Konstruktor:
     */

    KreisVererb() {
    }

    /**
     * Erzeugung und Setzen der Attributwerte auf die Attributwerte des Parameterobjekts von Point
     * und einem Parameterwertes:
     * @param p
     * @param radius
     */

    KreisVererb(Point p, int radius) {
        super(p); // konstruktor von Point aufrufen
        this.r = radius;
    }

    /**
     * Erzeugen und Setzen der Attribute auf die Attribute des Parameterobjektes:
     * @param k
     */
    KreisVererb(KreisVererb k) {
        this.x = k.x;
        this.y = k.y;
        this.r = k.r;
    }

    /**
     * Erzeugung und Setzen der Attributwerte auf die Parameterwerte:
     */

    KreisVererb(int x, int y, int radius) {
        super(x,y); // konstruktor von Point aufrufen
        this.r = radius;
    }
//Methoden:

    /**
     * Erzeugen eines neuen Kreises mit den gleichen Attributwerten wie des
     * aktuellen Objekts:
     * Unterschied zu Konstruktor ist anderer Aufrufmechanismus, analog zu
     * clone()
     */

    KreisVererb getLocation() {
        return (new KreisVererb(this,this.r));
    }

    /**
     * Setzen der Attributwerte auf die Attributwerte des Parameterobjekts:
     * @param k liefert den Referenzpunkt
     */

    void setLocation(KreisVererb k) {
        this.x = k.x;
        this.y = k.y;
        this.r = k.r;
    }

    /**
     * Setzen der Attributwerte auf die Parameterwerte:
     */

    void setLocation(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    /**
     * Verschiebung des Punktes um die Parameterwerte:
     * @param dx: Verschiebungswert in x-Richtung
     * @param dy: Verschiebungswert in y-Richtung
     */

    void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Standardmethode equals:
     */

    public boolean equals(KreisVererb k) {
        return ((this.x == k.x) && (this.y == k.y) && (this.r == k.r));
    }


    /**
     * Standardmethode liefert folgende Ausgabe (x,y):
     */

    public String toString() {
        return ("(" + this.x + "," + this.y + ","+ this.r + ")");
    }

    /**
     * Resizemethode um die groesse des Kreises anzupassen
     */
    void resize(int radius) {
        this.r = radius;
    }
    public static void main(String[] args) {
        KreisVererb k1 = new KreisVererb();
        System.out.println("Konstruktor1" + k1);
        KreisVererb k2 = new KreisVererb(k1);
        System.out.println("Konstruktor2" + k2);
        KreisVererb k3 = new KreisVererb(1,2, 3);
        System.out.println("Konstruktor3" + k3);
        k1.setLocation(11, 12);
        k2.setLocation(k1);
        System.out.println("k1: " + k1.x + k1.y + k1.r);
        System.out.println("k2: " + k2.x + k2.y + k2.r);
        System.out.println("k3: " + k3.x + k3.y + k3.r);
        System.out.println(k1.getLocation());
        k2.move(-10, -10);
        System.out.println(k2);
        System.out.println(k2.equals(k3));
        System.out.println(k1.equals(k3)); //toString nicht explizit, weil vorher bei println aufgerufen wurde.
        k1.resize(15);
        System.out.println(k1);
    }
}