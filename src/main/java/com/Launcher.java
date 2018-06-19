package com;

import com.handlers.Session;
import com.services.ProtocolService;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Launcher extends Application {

	public static void main(String[] args) {
		initDatabaseConnection();
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/CustomerLoginPage.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("PizzaHouse - Order Utility");
		stage.setScene(scene);
		stage.resizableProperty().set(false);
		stage.sizeToScene();
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent arg0) {
				stage.close();
				System.exit(2);
			}
			
		});
		stage.show();
		
		Session.setStage(stage);
	}
	
	private static void initDatabaseConnection() {
		Thread assistance = new Thread(() -> {
			ProtocolService.InitializeDatabaseConnection();
		});
		assistance.start();
	}
	
}