package Exceptions;

/**
 * <p>
 * Überschrift: Exception: Der Benutzer hat kein Daten
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Exception. Die Exception wird
 * ausgeloest, wenn der Benutzer keine Daten hat. (Kein pw UND keine ID)
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
public class BenutzerEmptyException extends BenutzerVerwaltungException {
	/**
	 * Konstruktor
	 */
	public BenutzerEmptyException() {
		super("Benutzer hat keine Daten!");
	}
}
