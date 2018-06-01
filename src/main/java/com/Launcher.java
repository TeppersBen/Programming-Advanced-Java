package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage state) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
		Scene scene = new Scene(root);
		state.setTitle("Pizza");
		state.setScene(scene);
		state.resizableProperty().set(false);
		state.sizeToScene();
		state.show();
	}
	
}
