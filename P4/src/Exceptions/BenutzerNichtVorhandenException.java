package Exceptions;

/**
 * <p>
 * Überschrift: Exception: Der Benutzer ist nicht vorhanden
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Exception. Die Exception wird ausgloest
 * wenn ein Benutzer nicht in der Datenhaltung gefunden werden kann.
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
public class BenutzerNichtVorhandenException
		extends BenutzerVerwaltungException {
	/**
	 * Konstruktor, Exception massage soll weiter gereicht werden
	 */
	public BenutzerNichtVorhandenException() {
		super("Benutzer nicht gefunden!");
	}
}
