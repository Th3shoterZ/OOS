package Aufgabe2;

public class Point {
    //public-Bereich

//Attribute:

    /**
     * x-Koordinate des Punktes:
     */

    int x;

    /**
     * y-Koordinate des Punktes:
     */
    int y;

// Konstruktoren:

    /**
     * Default-Konstruktor:
     */

    Point() {
    }

    /**
     * Erzeugung und Setzen der Attributwerte auf die Attributwerte des Parameterobjekts:
     */

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * Erzeugung und Setzen der Attributwerte auf die Parameterwerte:
     */

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//Methoden:

    /**
     * Erzeugen eines neuen Punktes mit den gleichen Attributwerten wie des   *   aktuellen Objekts:  *   Unterschied zu Konstruktor ist anderer Aufrufmechanismus, analog zu   *   clone()
     */

    Point getLocation() {
        return (new Point(this));
    }

    /**
     * Setzen der Attributwerte auf die Attributwerte des Parameterobjekts:  *   @param p liefert den Referenzpunkt
     */

    void setLocation(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * Setzen der Attributwerte auf die Parameterwerte:
     */

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Verschiebung des Punktes um die Parameterwerte:  *   @param dx: Verschiebungswert in x-Richtung  *   @param dy: Verschiebungswert in y-Richtung
     */

    void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Standardmethode equals:
     */

    public boolean equals(Point p) {
        return ((this.x == p.x) && (this.y == p.y));
    }


    /**
     * Standardmethode liefert folgende Ausgabe (x,y):
     */

    public String toString() {
        return ("(" + this.x + "," + this.y + ")");
    }


    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("Konstruktor1" + p1);
        Point p2 = new Point(p1);
        System.out.println("Konstruktor2" + p2);
        Point p3 = new Point(1, 2);
        System.out.println("Konstruktor3" + p3);
        p1.setLocation(11, 12);
        p2.setLocation(p1);
        System.out.println("p1: " + p1.x + p1.y);
        System.out.println("p2: " + p2.x + p2.y);
        System.out.println("p3: " + p3.x + p3.y);
        System.out.println(p1.getLocation());
        p2.move(-10, -10);
        System.out.println(p2);
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3)); //toString nicht explizit, weil vorher bei println aufgerufen wurde.
    }
}




