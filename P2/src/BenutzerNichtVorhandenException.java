/**
 * <p>
 * Überschrift: Exception: Der Benutzer ist nicht vorhanden
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Exception der Methode
 * - void benutzerLoeschen
 * Es soll überprüft werden ob der Nutzer in der
 * Liste/Datenhaltung vorhanden ist oder nicht, falls nicht wird die exception
 * ausgeloest.
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
public class BenutzerNichtVorhandenException extends Exception {
	/**
	 * Konstruktor, Exception massage soll weiter gereicht werden
	 * @param msg : string nachricht fuer fehlermeldung
	 */
	public BenutzerNichtVorhandenException(String msg) {
		super(msg);
	}
}
