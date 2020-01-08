/**
 * <p>
 * Überschrift: Tests fuer Klasse BenutzerVerwaltungAdmin
 * </p>
 * <p>
 * Beschreibung: Die Klasse enthaelt unit Tests fuer die Methoden,
 * der Klasse BenutzerVerwaltungAdmin
 *
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
package Tests;

import Benutzer.Benutzer;
import Benutzer.BenutzerVerwaltungAdmin;
import Exceptions.BenutzerVerwaltungException;
/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;*/
import org.junit.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class BenutzerVerwaltungAdminTest {

	/**
	 * Konstruktor
	 */
	public BenutzerVerwaltungAdminTest() {
	}

	BenutzerVerwaltungAdmin admin;

	Benutzer benutzer0;

	Benutzer benutzer1;

	Benutzer benutzer2;

	Benutzer benutzer3;

	Benutzer benutzerEmpty;

	Benutzer benutzerNoID;

	Benutzer benutzerNoPass;

	/**
	 * Setup der Tests, vor jedem test neu
	 */
	@Before
	public void setUp() throws Exception {
		admin = new BenutzerVerwaltungAdmin();
		benutzer0 = null;
		benutzer1 = new Benutzer("1", "pass1".toCharArray());
		benutzer2 = new Benutzer("2", "pass2".toCharArray());
		benutzer3 = new Benutzer("3", "pass3".toCharArray());
		benutzerEmpty = new Benutzer("", "".toCharArray());
		benutzerNoID = new Benutzer(null, "pass3".toCharArray());
		benutzerNoPass = new Benutzer("3", null);
		//super.setUp();
		// admin.dbInitialisieren();
	}

	/**
	 * Tear Down nach jedem Test
	 */
	@After
	public void tearDown() throws Exception {
		admin.dbInitialisieren();
		//super.tearDown();
	}

	/**
	 * Test 1: Benutzer wird eingtragen und mit BenutzerOK ueberprueft Dann haufen
	 * exceptions forcen
	 */
	@Test
	public void testBenutzerEintragen() throws BenutzerVerwaltungException {
		admin.benutzerEintragen(benutzer1);
		admin.benutzerEintragen(benutzer2);
		admin.benutzerOk(benutzer1);
		admin.benutzerOk(benutzer2);

		// Exceptions:
		try {
			admin.benutzerEintragen(benutzer0);
			fail("Expected a NullPointerException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerEintragen(benutzerEmpty);
			fail("Expected an EmptyException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerEintragen(benutzerNoID);
			fail("Expected a KeineIDException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerEintragen(benutzerNoPass);
			fail("Expected a KeinPasswortException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerEintragen(benutzer1);
			fail("Expected a VorhandenException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test 2: BenutzerOK wird ueberprueft zuerst benutzer nicht drin also muss es
	 * false sein, dann benutzer einfuegen und muss dann true sein. Dann Haufen
	 * Exceptions forcen
	 */
	@Test
	public void testBenutzerOk() throws BenutzerVerwaltungException {
		assertFalse(admin.benutzerOk(benutzer1));
		assertFalse(admin.benutzerOk(benutzer2));
		admin.benutzerEintragen(benutzer1);
		admin.benutzerEintragen(benutzer2);
		assertTrue(admin.benutzerOk(benutzer1));
		assertTrue(admin.benutzerOk(benutzer2));

		// Exceptions:
		try {
			admin.benutzerOk(benutzer0);
			fail("Expected a NullPointerException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerOk(benutzerEmpty);
			fail("Expected an EmptyException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerOk(benutzerNoID);
			fail("Expected a KeineIDException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerOk(benutzerNoPass);
			fail("Expected a KeinPasswortException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test 3: BenutzerLoeschen wird ueberprueft, Benutzer eintragen und sofort
	 * wieder loeschen, mit BenutzerOK ueberpruefen -> erwartung: false Dann
	 * Exceptions forcen
	 */
	@Test
	public void testBenutzerLöschen() throws BenutzerVerwaltungException {
		admin.benutzerEintragen(benutzer1);
		admin.benutzerEintragen(benutzer2);
		admin.benutzerLöschen(benutzer1);
		admin.benutzerLöschen(benutzer2);
		// admin.read();
		assertFalse(admin.benutzerOk(benutzer1));
		assertFalse(admin.benutzerOk(benutzer2));

		// Exceptions:
		try {
			admin.benutzerLöschen(benutzer0);
			fail("Expected a NullPointerException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerLöschen(benutzerEmpty);
			fail("Expected an EmptyException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerLöschen(benutzerNoID);
			fail("Expected a KeineIDException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerLöschen(benutzerNoPass);
			fail("Expected a KeinPasswortException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
		try {
			admin.benutzerLöschen(benutzer3);
			fail("Expected a NichtVorhandenException to be thrown.");
		} catch (BenutzerVerwaltungException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test 4: Dbinit ueberpruefen, Datenhaltung soll erstellt werden, hat aber
	 * groesse 0, also erwartet groesse 0
	 */
	@Test
	public void testDbinitialisieren() {
		admin.dbInitialisieren();
		admin.read();
		assertEquals(admin.getDatenhaltung().size(), 0);
	}

	/**
	 * Test 5: Das Lesen und schreiben soll getestet werden, Benutzer wird
	 * eingefuegt und dannach wird ausgelesen ob die groesse mit der TestDB
	 * uebereinstimmt -> erwartet: 1 und check ob ueberhaupt was drin ist,
	 */
	@Test
	public void testWriteRead() throws BenutzerVerwaltungException {
		admin.benutzerEintragen(benutzer1);
		ArrayList<Benutzer> DB2 = new ArrayList<Benutzer>();
		DB2.add(0, benutzer1);

		assertEquals(admin.getDatenhaltung().size(), 1);
		assertEquals(DB2.size(), 1);
		assertEquals(admin.getDatenhaltung(), DB2);
	}
}