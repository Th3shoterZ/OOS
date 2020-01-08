/**
 * <p>
 * Überschrift: Interface der BenutzerVerwaltung
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient der Deklarierung der Methoden:
 *      - void benutzerEintragen(Benutzer benutzer)
 *      - boolean benutzerOk(Benutzer benutzer)
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
	 * @param benutzer : Objekt von Benutzer
	 * @throws BenutzerVorhandenException : vorher werfen um in main zu catchen
	 */
	void benutzerEintragen(Benutzer benutzer) throws BenutzerVorhandenException;

	/**
	 * Check: Ist in der Datenhaltung der Benutzer im Parameter bereits vorhanden
	 * 
	 * @param benutzer : Objekt von Benutzer
	 * @return : gibt boolean wieder
	 */
	boolean benutzerOk(Benutzer benutzer);
}
