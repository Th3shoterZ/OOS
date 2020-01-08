package GUI;

import Benutzer.Benutzer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * <p>
 * Überschrift: Login Controller
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Controller fuer die fxml Datei: "login"
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
public class LoginController {

	/**
	 * Button aus fxml
	 */
	@FXML
	Button anwendenBtn;

	/**
	 * Checkbox aus fxml
	 */
	@FXML
	CheckBox anmeldungBox;

	/**
	 * Textfeld aus fxml
	 */
	@FXML
	TextField useridString;

	/**
	 * Passwordfeld aus fxml
	 */
	@FXML
	PasswordField passwortString;

	/**
	 * Ein Boolean fuer den Wert der Checkbox zu speichern.
	 */
	private boolean neuAnmeldung = false;

	/**
	 * Methode zum aendern des Booleans der Checkbox, gibt Aktuellen !bei
	 * aenderung des Wertes! in der Konsole aus
	 */
	@FXML
	void checkNeuAnmeldung() {
		if (anmeldungBox.isSelected()) {
			neuAnmeldung = true;
			System.out.println("Neu-Anmeldung = true");
		} else {
			neuAnmeldung = false;
			System.out.println("Neu-Anmeldung = false");
		}
	}

	/**
	 * Nimmt Eingaben aus den Text/passwordfeldern und erstellt ein neues Objket
	 * der Klasse Benutzer und gibt die Werte des Benutzers in der Konsole aus.
	 */
	@FXML
	void anwenden() {
		String userID = useridString.getText();
		String passwort = passwortString.getText();
		Benutzer benutzer = new Benutzer(userID, passwort.toCharArray());
		System.out.println(benutzer);
		Stage stage = (Stage) anwendenBtn.getScene().getWindow();
		stage.close();
	}

}
