package Benutzer;

import Exceptions.*;

import java.io.*;
import java.util.ArrayList;

/**
 * <p>
 * Überschrift: Admin der Benutzer.BenutzerVerwaltung
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient dem Verwalten der Benutzer.Benutzer Diese
 * Klasse soll es ermöglichen Benutzer.Benutzer einer 'Datenbank' zuzufügen, zu
 * überprüfen ob dieser schon vorhanden ist und einen Benutzer.Benutzer zu
 * löschen. Diese Klasse implementiert das Interface Benutzer.BenutzerVerwaltung
 * und beinhaltet folgende Methoden:
 * 		-void benutzerEintragen(Benutzer benuzter)
 * 		-boolean benutzerOk(Benutzer.Benutzer benutzer)
 * 		-void benutzerLöschen(Benutzer.Benutzer benutzer)
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

public class BenutzerVerwaltungAdmin
		implements BenutzerVerwaltung, Serializable { // Serializable added
	// Attribute
	/**
	 * Attribut datenHaltung zur Speicherung/Haltung der Benutzer.Benutzer
	 */
	private ArrayList<Benutzer> datenHaltung = new ArrayList<>(); // ArrayList, da
																																// es einfacher
																																// ist

	/**
	 * Default Konstruktor
	 */
	public BenutzerVerwaltungAdmin() {

	}

	// Methoden

	/**
	 * Getter fuer Datenhaltung
	 * 
	 * @return
	 */
	public ArrayList<Benutzer> getDatenhaltung() {
		return datenHaltung;
	}

	/**
	 * Setter fuer Datenhaltung
	 * 
	 * @param datenHaltung
	 *          : Arraylist fuer datenhaltung
	 */
	public void setDatenhaltung(ArrayList<Benutzer> datenHaltung) {
		this.datenHaltung = datenHaltung;
	}

	/**
	 * benutzerOk soll überprüfen, ob der Benuzter schon vorhanden ist.
	 * 
	 * @param benutzer:
	 *          Objekt der Klasse Benutzer.Benutzer
	 * @return datenHaltung.contains(benutzer): benutzer vorhanden, true oder
	 *         false
	 */
	public boolean benutzerOk(Benutzer benutzer)
			throws BenutzerVerwaltungException {

		if (benutzer == null) {
			throw new BenutzerNullPointerException();

		} else if ((benutzer.userId == null) || (benutzer.userId.isEmpty())
				&& (benutzer.passWort == null || benutzer.passWort.length == 0)) {
			throw new BenutzerEmptyException();

		} else if (benutzer.userId == null || benutzer.userId.isEmpty()) {
			throw new BenutzerKeineIDException();

		} else if (benutzer.passWort == null || benutzer.passWort.length == 0) {
			throw new BenutzerKeinPasswortException();

		} else {
			read();
			for (Benutzer b : datenHaltung)
				if (b.equals(benutzer))
					return true;
		}
		return false;
	}

	/**
	 * benutzerEintragen soll den, über den parameter übergebenen,
	 * Benutzer.Benutzer in die Datenhaltung speichern
	 * 
	 * @param benutzer:
	 *          Objekt der Klasse Benutzer.Benutzer
	 */
	public void benutzerEintragen(Benutzer benutzer)
			throws BenutzerVerwaltungException {

		if (benutzer == null) {
			throw new BenutzerNullPointerException();

		} else if ((benutzer.userId == null) || (benutzer.userId.isEmpty())
				&& (benutzer.passWort == null || benutzer.passWort.length == 0)) {
			throw new BenutzerEmptyException();

		} else if ((benutzer.userId == null) || (benutzer.userId.isEmpty())) {
			throw new BenutzerKeineIDException();

		} else if (benutzer.passWort == null || benutzer.passWort.length == 0) {
			throw new BenutzerKeinPasswortException();

		} else {
			read();

			boolean found = false;
			for (Benutzer b : datenHaltung) {
				if (b.userId.equals(benutzer.userId))
					found = true;
			}
			if (found) {
				throw new BenutzerVorhandenException();
			} else {
				this.datenHaltung.add(benutzer);
				write();
			}
		}
	}

	/**
	 * benutzerLoeschen soll den Benutzer.Benutzer, der über den parameter
	 * übergeben, wurde löschen
	 * 
	 * @param benutzer:
	 *          Objekt der Klasse Benutzer.Benutzer
	 */
	public void benutzerLöschen(Benutzer benutzer)
			throws BenutzerVerwaltungException {

		if (benutzer == null) {
			throw new BenutzerNullPointerException();

		} else if ((benutzer.userId == null) || (benutzer.userId.isEmpty())
				&& (benutzer.passWort == null || benutzer.passWort.length == 0)) {
			throw new BenutzerEmptyException();

		} else if (benutzer.userId == null || benutzer.userId.isEmpty()) {
			throw new BenutzerKeineIDException();

		} else if (benutzer.passWort == null || benutzer.passWort.length == 0) {
			throw new BenutzerKeinPasswortException();
		} else {
			read();

			if (!this.datenHaltung.contains(benutzer))
				throw new BenutzerNichtVorhandenException();
			else {
				datenHaltung.remove(benutzer);
				write();
			}
		}
	}

	/**
	 * Datenstruktur soll persistent initiaisiert werden
	 */
	public void dbInitialisieren() {
		datenHaltung.clear();
		write();
	}

	/**
	 * Funktion zum einfachen schreiben in die Datei
	 */
	public void write() {
		try {
			FileOutputStream fs = new FileOutputStream("Users.s");
			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(datenHaltung);
			os.close();
			fs.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funktion zum einfachen lesen der Datei
	 */
	public void read() {
		try {
			FileInputStream fs = new FileInputStream("Users.s");
			ObjectInputStream is = new ObjectInputStream(fs);

			this.datenHaltung = (ArrayList<Benutzer>) is.readObject();
			is.close();
			fs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
