package Exceptions;

/**
 * <p>
 * Überschrift: Exception: Der Benutzer ist schon Vorhanden
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Exception. Die Exception wird ausgeloest
 * wenn ein benutzer schon vorhanden ist
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
public class BenutzerVorhandenException extends BenutzerVerwaltungException {
	/**
	 * Konstruktor, Exception massage soll weiter gereicht werden
	 */
	public BenutzerVorhandenException() {
		super("Benutzer ist bereits vorhanden.");
	}
}
