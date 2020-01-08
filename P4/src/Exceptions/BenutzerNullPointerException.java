package Exceptions;

/**
 * <p>
 * Überschrift: Exception: NullPointer
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Exception. Die Exception wird ausgloest
 * wenn ein Nullpointer uebergeben wird
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
public class BenutzerNullPointerException extends BenutzerVerwaltungException {
	/**
	 * Konstruktor
	 */
	public BenutzerNullPointerException() {
		super("Keine Referenz zum Benutzer gefunden.");
	}
}
