
package com.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/GUI.fxml"));
		stage.setScene(new Scene(root, 340, 520));
		stage.setTitle("Calculator");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
