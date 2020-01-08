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
public class Benutzer {
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
	Benutzer() {

	}

	/**
	 * Konstruktor mit:
	 * 
	 * @param id:
	 *          beliebiger string, dient als neue userId
	 * @param pw:
	 *          beliebiges char-Array, dient als neues passWort
	 */
	Benutzer(String id, String pw) {
		this.userId = id;
		this.passWort = pw.toCharArray();
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
	public boolean equals(Object benutzer) {
		return this == benutzer;
	}

	/**
	 * Übertragung der Methode "toString" der Klasse "Object"
	 */
	public String toString() {
		String str = String.copyValueOf(this.passWort); // kopieren des char Arrays in einen String
		return ("UserID: " + this.userId + " ; " + "Passwort: " + str); // zur korrekten Ausgabe
	}
}
