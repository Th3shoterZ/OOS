package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * <p>
 * Überschrift: Anwedungs Controller
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient als Controller fuer die fxml Datei:
 * "anwendung"
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
public class AnwendungsController {

	/**
	 * Button aus fxml
	 */
	@FXML
	Button beendenBtn;

	/**
	 * Methode zum schliessen des Fensters, beim schliessen wird Nachricht in die
	 * Konsole ausgegeben
	 */
	@FXML
	void beenden() {
		System.out.println("Das Programm wurde abgebrochen.");
		Stage stage = (Stage) beendenBtn.getScene().getWindow();
		stage.close();
	}
}
