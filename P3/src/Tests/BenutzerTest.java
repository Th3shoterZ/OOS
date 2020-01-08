/**
 * <p>
 * Überschrift: Tests fuer Klasse Benutzer
 * </p>
 * <p>
 * Beschreibung: Diese Klasse enthaelt unit Tests fuer die Methoden,
 * der Klasse Benutzer
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
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BenutzerTest {

	/**
	 * Setup Testing
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * Tear down when done
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {

	}

	/**
	 * Test 1: ueberpruefen ob der Konstruktor richtig arbeitet
	 */
	@Test
	public void testBenutzerStringString() {
		Benutzer ben1 = new Benutzer("uid", "pwd".toCharArray());
		assertEquals("uid", ben1.userId);
		assertEquals("pwd", String.valueOf(ben1.passWort));
	}

	/**
	 * Test 2: Equals wird ueberprueft, assertEquals benutzt Equals aus Class
	 * Benutzer einmal Equals und einmal NotEquals
	 */
	@Test
	public void testEqualsBenutzer() {
		Benutzer ben1 = new Benutzer("ID", "pwd".toCharArray());
		Benutzer ben2 = new Benutzer("ID", "pwd".toCharArray());
		assertEquals(ben1, ben2);
		Benutzer ben3 = new Benutzer("ui", "pw".toCharArray());
		assertNotEquals(ben1, ben3);
	}

	/**
	 * Test 3: ueberpruefe ob Objekt als korrekten String ausgegeben wird.
	 */
	@Test
	public void testToStringBenutzer() {
		Benutzer ben1 = new Benutzer("uid", "pwd".toCharArray());
		assertEquals(ben1.toString(), "UserID: " + ben1.userId + " ; "
				+ "Passwort: " + String.copyValueOf(ben1.passWort));
	}
}