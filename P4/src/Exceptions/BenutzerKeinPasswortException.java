package Exceptions;

/**
 * <p>
 * Überschrift: Exception: Der Benutzer hat kein Passwort
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Exception. Die Exception wird
 * ausgeloest, wenn der Benutzer kein Passwort hat.
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
public class BenutzerKeinPasswortException extends BenutzerVerwaltungException {
	/**
	 * Konstruktor
	 */
	public BenutzerKeinPasswortException() {
		super("Benutzer hat kein Passwort!");
	}
}
