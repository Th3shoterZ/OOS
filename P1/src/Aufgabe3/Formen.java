package Aufgabe3;

/*
 Die Klasse dient als Behälter für die Objekte KreisAgg und Rechteck,
 damit man beide Objektarten in einem Array haben kann.
 */

import Aufgabe3.KreisAgg;

/**
 * Diese Klasse kann Kreise und Rechtecke speichern
 */
public class Formen {
    // attribute
    KreisAgg k;
    Rechteck r;
    // Konstruktoren
    /**
     * Default Konstruktor
     */
    Formen() {

    }

    /**
     * Konstruktor nur mit Kreis
     * @param k
     */
    Formen(KreisAgg k) {
        this.k = new KreisAgg(k);
        this.r = new Rechteck(0,0,0,0);
    }

    /**
     *  Konstuktor nur mit Rechtek
     * @param r
     */
    Formen(Rechteck r) {
        this.k = new KreisAgg(0,0,0);
        this.r = r;
    }


    public static void main ( String[] args) {
        // arr zum speichern der formen
        Formen form[] = new Formen[4];

        // kreise und rechtecke definieren
        KreisAgg k1 = new KreisAgg(1,2,3);
        KreisAgg k2 = new KreisAgg(4,5,6);
        Rechteck r1 = new Rechteck(1,2,3,4);
        Rechteck r2 =  new Rechteck(5,6,7,8);

        // formen werden mit den kreisen oder rechtecken initialisiert
        Formen form1 = new Formen(k1);
        Formen form2 = new Formen(k2);
        Formen form3 = new Formen(r1);
        Formen form4 = new Formen(r2);

        // formen werden dem array eingeordnet
        form[0] = form1;
        form[1] = form2;
        form[2] = form3;
        form[3] = form4;

        // ausrechnen der gesamtflaechen
        double gesamtflaeche = form[0].k.getFlaecheninhalt() + form[1].k.getFlaecheninhalt() + form[2].r.getFlaecheninhalt() + form[3].r.getFlaecheninhalt();

        // ausgabe der einzelnen flaechen und gesamt
        System.out.println(form[0].k.getFlaecheninhalt() + ", " + form[1].k.getFlaecheninhalt() + ", " + form[2].r.getFlaecheninhalt() + ", " + form[3].r.getFlaecheninhalt());
        System.out.println(gesamtflaeche);
    }
}
