package Aufgabe3;

/*
Eine Kreis Klasse die von der Klasse Point Attrbute und co durch Aggregation erhält
 */


import Aufgabe3.Point;


public class KreisAgg {
        // Attribute
        int r; // radius
        Point p; // hier mittelpunkt


        // Konstruktoren:

        /**
         * Default-Konstruktor:
         */

        KreisAgg() {
        }

        /**
         * Erzeugung und Setzen der Attributwerte auf die Attributwerte des Parameterobjekts von Point
         * und einem Parameterwertes:
         */

        KreisAgg(Point p, int radius) {
            this.p = p; // konstruktor von Point aufrufen
            this.r = radius;
        }

        /**
         * Erzeugen und Setzen der Attribute auf die Attribute des Parameterobjektes:
         */
        KreisAgg(KreisAgg k) {
            this.p = k.p;
            this.r = k.r;
        }

        /**
         * Erzeugung und Setzen der Attributwerte auf die Parameterwerte:
         */

        KreisAgg(int x, int y, int radius) {
            this.p = new Point(x,y); // konstruktor von Point aufrufen
            this.r = radius;
        }
//Methoden:

        /**
         * Erzeugen eines neuen Kreises mit den gleichen Attributwerten wie des
         * aktuellen Objekts:
         * Unterschied zu Konstruktor ist anderer Aufrufmechanismus, analog zu
         * clone()
         */

        KreisAgg getLocation() {
            return (new KreisAgg(this));
        }

        /**
         * Setzen der Attributwerte auf die Attributwerte des Parameterobjekts:
         * @param k liefert den Referenzpunkt
         */

        void setLocation(KreisAgg k) {
            this.p = k.p;
            this.r = k.r;
        }

        /**
         * Setzen der Attributwerte auf die Parameterwerte:
         */

        void setLocation(int x, int y, int r) {
            this.p = new Point(x,y);
            this.r = r;
        }


        /**
         * Standardmethode equals:
         */

        public boolean equals(KreisAgg k) {
            return ((this.p == k.p) && (this.r == k.r));
        }


        /**
         * Standardmethode liefert folgende Ausgabe (x,y):
         */

        public String toString() {
            return ("(" + this.p + ","+ this.r + ")");
        }

        /**
         * Methode clone soll eine Kopie in einem neuen Objekt erstellen
         */
        KreisAgg clone(KreisAgg k) {
            return (new KreisAgg(this));
        }
        /**
         * Flächenberechnung
         */
        double getFlaecheninhalt() {
            return (this.r*this.r*Math.PI);
        }
}
