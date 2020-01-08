package Exceptions;

/**
 * <p>
 * Überschrift: Exceptions fuer BenuzterVerwaltung
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Parent fuer andere Exception Klassen
 * fuer die BenutzerVerwaltung
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
public class BenutzerVerwaltungException extends Exception {
	/**
	 * Konstruktor
	 */
	public BenutzerVerwaltungException(String msg) {
		super(msg);
	}
}
