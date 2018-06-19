package com;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import com.handlers.Session;
import com.services.ProtocolService;

public class Launcher extends Application {

	public static void main(String[] args) {
		initDatabaseConnection();
		launch(args);
		Client client = ClientBuilder.newClient();
		System.out.println(client.target("http://localhost:8080/Webcomponents/rest/hello"));
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