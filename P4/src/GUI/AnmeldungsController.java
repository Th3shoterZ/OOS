package GUI;

import Benutzer.Benutzer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * <p>
 * Überschrift: Anmeldungs Controller
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Controller fuer die fxml Datei:
 * "anmeldung"
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
public class AnmeldungsController {

	/**
	 * Button aus fxml
	 */
	@FXML
	Button anmeldenBtn;

	/**
	 * Textfeld aus fxml
	 */
	@FXML
	TextField useridString;

	/**
	 * Passwortfeld aus fxml
	 */
	@FXML
	PasswordField passwortFreshString;

	/**
	 * Passwortfeld aus fxml
	 */
	@FXML
	PasswordField passwortConfirmString;

	/**
	 * Methode die ueberprueft, ob die passwoerter gleich sind. Wenn sie nicht
	 * gleich sind wird eine Warnung in das Textfeld, der UserID, ausgegeben. Wenn
	 * sie gleich sind soll ein neues Objekt der Klasse Benutzer erstellt werden
	 * und dieses in der Konsole ausgegeben werden und das Fenster geschlossen
	 * werden.
	 */
	@FXML
	void anmelden() {
		String passwortConfirm = passwortConfirmString.getText();
		String passwort = passwortFreshString.getText();
		String userID = useridString.getText();
		if (!passwort.equals(passwortConfirm)) {
			useridString.setText("Passwort != Wiederholung");
		} else {
			Benutzer benutzer = new Benutzer(userID, passwort.toCharArray());
			System.out.println(benutzer);
			Stage stage = (Stage) anmeldenBtn.getScene().getWindow();
			stage.close();
		}
	}

}
