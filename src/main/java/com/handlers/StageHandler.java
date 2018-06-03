package com.handlers;

import javafx.stage.Stage;

public class StageHandler {

	private static Stage stage;
	
	public static void setStage(Stage s) {
		stage = s;
	}
	
	public static Stage getStage() {
		return stage;
	}
	
}