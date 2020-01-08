import java.util.ArrayList;

/**
 * <p>
 * Überschrift: Admin der BenutzerVerwaltung
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient dem Verwalten der Benutzer Diese Klasse soll
 * es ermöglichen Benutzer einer 'Datenbank' zuzufügen, zu überprüfen ob dieser
 * schon vorhanden ist und einen Benutzer zu löschen. Diese Klasse implementiert
 * das Interface BenutzerVerwaltung und beinhaltet folgende Methoden:
 *      -void benutzerEintragen(Benutzer benuzter)
 *      -boolean benutzerOk(Benutzer benutzer)
 *      -void benutzerLöschen(Benutzer benutzer)
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

public class BenutzerVerwaltungAdmin implements BenutzerVerwaltung {
    // Attribute
	/**
	 * Attribut datenHaltung zur Speicherung/Haltung der Benutzer
	 */
	private ArrayList datenHaltung = new ArrayList(); // ArrayList, da es einfacher ist

	/**
	 * Default Konstruktor
	 */
	public BenutzerVerwaltungAdmin() {

	}

	// Methoden
	/**
	 * benutzerOk soll überprüfen, ob der Benuzter schon vorhanden ist.
	 * 
	 * @param benutzer:
	 *          Objekt der Klasse Benutzer
	 * @return datenHaltung.contains(benutzer): benutzer vorhanden, true oder
	 *         false
	 */
	public boolean benutzerOk(Benutzer benutzer) {
		return datenHaltung.contains(benutzer);
	}

	/**
	 * benutzerEintragen soll den, über den parameter übergebenen, Benutzer in die
	 * Datenhaltung speichern
	 * 
	 * @param benutzer:
	 *          Objekt der Klasse Benutzer
	 */
	public void benutzerEintragen(Benutzer benutzer)
			throws BenutzerVorhandenException {
		if (!this.benutzerOk(benutzer)) {
			datenHaltung.add(benutzer);
		}
		else {
			throw new BenutzerVorhandenException("Benutzer ist bereits vorhanden!");
		}
	}

	/**
	 * benutzerLoeschen soll den Benutzer, der über den parameter übergeben, wurde
	 * löschen
	 * 
	 * @param benutzer:
	 *          Objekt der Klasse Benutzer
	 */
	public void benutzerLoeschen(Benutzer benutzer)
			throws BenutzerNichtVorhandenException {
		if (this.benutzerOk(benutzer)) {
			datenHaltung.remove(benutzer);
		}
		else {
			throw new BenutzerNichtVorhandenException(
					"Benutzer ist NICHT vorhanden!");
		}
	}

	/**
	 * Main function
	 * 
	 * @param args :
	 */
	public static void main(String[] args) {
		BenutzerVerwaltungAdmin Ver = new BenutzerVerwaltungAdmin();
		Benutzer b1 = new Benutzer("shoter", "passwort");
		Benutzer b2 = new Benutzer("Geralt", "vonRiva");
		System.out.println("Benutzer 1 = " + b1);
		System.out.println("Benutzer 2 = " + b2);
		System.out.println("-------------------------------");
		try {
			System.out.println("Benutzer 1 loeschen; expected = Exception");
			Ver.benutzerLoeschen(b1); // Exception
			System.out.println("done1");
		} catch (BenutzerNichtVorhandenException e) {
			System.out.println("Fehler: Benutzer ist NICHT vorhaden!");
		}
		System.out.println("-------------------------------");
		try {
			System.out.println("Benutzer 1 einfügen; expected = done2");
			Ver.benutzerEintragen(b1); // ist ok
			System.out.println("done2");
		} catch (BenutzerVorhandenException e) {
			System.out.println("Fehler: Dieser Benutzer ist bereits vorhanden!");
		}
		System.out.println("-------------------------------");
		try {
			System.out.println("Benutzer 1 einfügen; expected = Exception");
			Ver.benutzerEintragen(b1); // ist ok
			System.out.println("done3");
		} catch (BenutzerVorhandenException e) {
			System.out.println("Fehler: Dieser Benutzer ist bereits vorhanden!");
		}
		System.out.println("-------------------------------");
		try {
			System.out.println("Benutzer 2 einfügen; expected = done4");
			Ver.benutzerEintragen(b2); // ist ok
			System.out.println("done4");
		} catch (BenutzerVorhandenException e) {
			System.out.println("Fehler: Dieser Benutzer ist bereits vorhanden!");
		}
		System.out.println("-------------------------------");
		try {
			System.out.println("Benutzer 1 loeschen; expected = done5");
			Ver.benutzerLoeschen(b1); // Exception
			System.out.println("done5");
		} catch (BenutzerNichtVorhandenException e) {
			System.out.println("Fehler: Benutzer ist NICHT vorhaden!");
		}
		System.out.println("-------------------------------");
		try {
			System.out.println("Benutzer 2 loeschen; expected = done6");
			Ver.benutzerLoeschen(b2); // Exception
			System.out.println("done6");
		} catch (BenutzerNichtVorhandenException e) {
			System.out.println("Fehler: Benutzer ist NICHT vorhaden!");
		}
		System.out.println("-------------------------------");
		try {
			System.out.println("Benutzer 2 loeschen; expected = Exception");
			Ver.benutzerLoeschen(b2); // Exception
			System.out.println("done7");
		} catch (BenutzerNichtVorhandenException e) {
			System.out.println("Fehler: Benutzer ist NICHT vorhaden!");
		}
		System.out.println("-------------------------------");
		System.out.println("does equals method defined in class:Benutzer work? \nexpected = false --- actual: " + b1.equals(b2));
	}
}
