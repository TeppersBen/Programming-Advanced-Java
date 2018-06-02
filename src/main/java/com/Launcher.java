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
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/HelloWorld.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("PizzaHouse - Order Utility");
		stage.setScene(scene);
		stage.resizableProperty().set(false);
		stage.sizeToScene();
		stage.show();
	}
	
}