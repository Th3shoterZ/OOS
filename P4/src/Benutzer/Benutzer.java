package Benutzer;

import java.io.Serializable;

/**
 * <p>
 * Überschrift: Struktur von Benutzern
 * </p>
 * <p>
 * Beschreibung: Diese Klasse definiert die grundlegende Struktur von Benutzern.
 * Die Struktur eines Benutzers setzt sich zusammen aus:
 *      - der UserId und
 *      - dem Passwort
 * Da es nur um eine Struktur geht, werden lediglich die beiden
 * Standardmethoden equals und toString implementiert.
 * </p>
 *
 * <p>
 * Copyright: Heinz Faßbender Copyright (c) 2003
 * </p>
 * <p>
 * Organisation: FH Aachen, FB05
 * </p>
 * 
 * @author Wout Vervoort
 * @version 1.0
 */
public class Benutzer implements Serializable {
	// Attribute

	/**
	 * Attribut zur Speicherung der UserID:
	 */
	public String userId = "Mustermann"; // default values!!!

	/**
	 * Attribut zur Speicherung des Passwortes:
	 */
	public char[] passWort = {'p','w'}; // default values!!!

	// Konstrutoren

	/**
	 * Default Konstruktor
	 */
	public Benutzer() {

	}

	/**
	 * Konstruktor mit:
	 * 
	 * @param id:
	 *          beliebiger string, dient als neue userId
	 * @param pw:
	 *          beliebiges char-Array, dient als neues passWort
	 */
	public Benutzer(String id, char[] pw) {
		this.userId = id;
		this.passWort = pw;
	}

	/**
	 * Konstruktor mit:
	 * 
	 * @param benutzer:
	 *          Objekt der Klasse benutzer
	 */
	Benutzer(Benutzer benutzer) {
		this.userId = benutzer.userId;
		this.passWort = benutzer.passWort;
	}
	// Methoden

	/**
	 * Übertragung der Methode "equals" der Klasse "Object" mit parameter:
	 * 
	 * @param benutzer:
	 *          Objekt der Klasse Object
	 */
	public boolean equals(Object benutzer){
        if(benutzer == this) {
            return true;
        }
        if(!(benutzer instanceof Benutzer)) {
            return false;
        }
        Benutzer ben = (Benutzer) benutzer;
        return (this.toString().equals(ben.toString()));
	}

	/**
	 * Übertragung der Methode "toString" der Klasse "Object"
	 */
	public String toString() {
		return ("UserID: " + this.userId + " ; " + "Passwort: " + String.copyValueOf(this.passWort));
	}
}
