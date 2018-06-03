package com.handlers;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class SceneHandler {

	public static Scene getCustomerLoginScene() {
		try {
			return new Scene(FXMLLoader.load(SceneHandler.class.getResource("/fxml/CustomerLoginPage.fxml")));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Scene getPizzaOrderScene() {
		try {
			return new Scene(FXMLLoader.load(SceneHandler.class.getResource("/fxml/MainWindow.fxml")));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}