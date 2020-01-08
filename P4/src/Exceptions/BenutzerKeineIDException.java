package Exceptions;

/**
 * <p>
 * Überschrift: Exception: Der Benutzer hat keine ID
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Exception. Die Exception wird
 * ausgeloest, wenn der Benutzer keine ID hat.
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
public class BenutzerKeineIDException extends BenutzerVerwaltungException {
	/**
	 * Konstruktor
	 */
	public BenutzerKeineIDException() {
		super("Benutzer hat keine ID!");
	}
}
