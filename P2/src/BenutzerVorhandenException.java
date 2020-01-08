/**
 * <p>
 * Überschrift: Exception: Der Benutzer ist schon Vorhanden
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Exception der Methode
 * - void benutzerEintragen
 * Es soll ueberprueft werden ob ein Benutzer schon in der
 * Liste/Datenhaltung vorhanden ist, falls schon, wird die Exception ausgeloest
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
public class BenutzerVorhandenException extends Exception {
	/**
	 * Konstruktor, Exception massage soll weiter gereicht werden
	 * @param msg : string nachricht fuer fehlermeldung
	 */
	public BenutzerVorhandenException(String msg) {
		super(msg);
	}
}
