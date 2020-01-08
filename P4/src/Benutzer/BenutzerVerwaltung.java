package Benutzer;

import Exceptions.BenutzerVerwaltungException;
import Exceptions.BenutzerVorhandenException;

/**
 * <p>
 * Überschrift: Interface der Benutzer.BenutzerVerwaltung
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient der Deklarierung der Methoden:
 *      - void benutzerEintragen(Benutzer.Benutzer benutzer)
 *      - boolean benutzerOk(Benutzer.Benutzer benutzer)
 * Die allen Nutzer des Systems und insbesondere auch den späteren Clients zur
 * Verfügung stehen soll.
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
public interface BenutzerVerwaltung {
	/**
	 * Benutzere aus Parameter in die Datenhaltung einfuegen, werfe exception
	 * 
	 * @param benutzer : Objekt von Benutzer.Benutzer
	 * @throws BenutzerVorhandenException : vorher werfen um spaeter zu catchen
	 */
	void benutzerEintragen(Benutzer benutzer) throws BenutzerVerwaltungException;

	/**
	 * Check: Ist in der Datenhaltung der Benutzer.Benutzer im Parameter bereits vorhanden
	 * 
	 * @param benutzer : Objekt von Benutzer.Benutzer
	 * @return : gibt boolean wieder
	 * @throws BenutzerVerwaltungException : vorher werfen um spaeter zu catchen
	 */
	boolean benutzerOk(Benutzer benutzer) throws BenutzerVerwaltungException;
}
