package Aufgabe1;

/*
 Ein Pascalsches Dreieck soll auf der Konsole ausgeben werden
 Die Tiefe soll vom Nutzer eingegeben werden können
 */

import java.util.Scanner;   // scanner fuer user input


public class PascalscheDreieck {
   public static void main( String[] args) {

       /*
        * ANFRAGE: wie tief soll das dreieck sein?
        */
       Scanner MyScanner = new Scanner(System.in);                      // erstellen eines scanners fuer userinputs
       System.out.println("Bitte die Tiefe des Dreiecks eingeben: ");   // Anfrage der Tiefeneingabe
       int eingabe = MyScanner.nextInt();                               // nextInt allows to read integer inputs

       /*
        * Erstellen einer Matrix mit Hoehen und Breiten Werten aus "Eingabe"
        */
       int[][] pascal = new int[eingabe][eingabe];  // matrix fuer darstellung und berechnung des Dreiecks

       /*Berechenen des Dreiecks,
        * jede Zahl ist die Summe der zwei obrigen Zahlen
        */
       for(int tiefe = 0; tiefe < eingabe; tiefe++) {  // äusserer loop fuer die tiefe des Dreiecks
           if(tiefe == 0) {                 // wenn die tiefe == 0 ist
               pascal[0][0] = 1;            // dann fuellenn wir 0/0 mit einer 1
               int i = 1;
               while(i < eingabe) {
                   pascal[tiefe][i] = 0;    // und den rest mit Nullen
                   i++;                     // i = hier zaehler
               }
           }
           else {
               for(int breite = 0; breite < eingabe; breite++) {    // innerer loop fuer die breite
                    if(breite == 0) {                               // die erste zahl der linie ist immer eine 1
                        pascal[tiefe][breite] = 1;                  // also immer x/0 = 1
                    }
                    else {
                        pascal[tiefe][breite] = pascal[tiefe-1][breite-1] + pascal[tiefe-1][breite]; // sonst die formel
                    }
               }
           }
       }

       /*ausgeben des Dreiecks
        * seperates ausgeben, weil uebersichtlicher, erhoeht zwar laufzeit,
        * aber bei diesem kleinen code juckt mich das aber nicht
        */
       for(int tiefe = 0; tiefe < eingabe; tiefe++) {               // äusserer loop fuer tiefe
           for(int breite =  0; breite < eingabe; breite++) {       // innerer loop fuer breite
               if(pascal[tiefe][breite] != 0) {                     // wir muessen keine nullen darstellen also lassen wir die raus
                   System.out.print(pascal[tiefe][breite] + " ");   // ausgeben der zahl plus eine leerstelle fuer richtiges format
               }
           }
           System.out.print("\n");                                  // neue zeile fuer richtiges format
       }
   }
}
