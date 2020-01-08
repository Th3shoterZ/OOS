package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * <p>
 * Überschrift: Main Klasse für JavaFx
 * </p>
 * <p>
 * Beschreibung: Diese Klasse dient dem Ausführen der JavaFx Controller damit
 * die Fenster geöffnet werden.
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
public class Main extends Application {

	/**
	 * Da wir 3 Fenster benötigen, machen wir 3 Stages
	 */
	private Stage refStage1 = new Stage();

	private Stage refStage2 = new Stage();

	private Stage refStage3 = new Stage();


	/**
	 * Die start Methode lädt alle Fenster
	 *
	 * @param primaryStage : needed for override
	 * @throws Exception : Exception
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		refStage1 = primaryStage;
	    loadAnwendung();
		loadLogin();
		loadAnmeldung();
	}

	/**
	 * Methode zum laden Des Fensters Anwendung
	 */
	public void loadAnwendung() {
		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("anwendung.fxml"));
			Parent root = loader.load();

			refStage1.setTitle("Anwendung");
			refStage1.setScene(new Scene(root, 450, 250));
			refStage1.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Methode zum laden des Fensters Login
	 */
	public void loadLogin() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
			Parent root = loader.load();

			refStage2.setTitle("Benutzerverwaltung - Login");
			refStage2.setScene(new Scene(root, 350, 250));
			refStage2.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Methode zum laden des Fensters Anmelden
	 */
	public void loadAnmeldung() {
		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("anmeldung.fxml"));
			Parent root = loader.load();

			refStage3.setTitle("Benutzerverwaltung - Anmeldung");
			refStage3.setScene(new Scene(root, 350, 250));
			refStage3.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    /**
     * Main Methode
     * @param args :
     */
    public static void main(String[] args) {
        launch(args);
    }
}
