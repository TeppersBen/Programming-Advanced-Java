package com;

import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MultiSelectListView<T> extends ListView<T>{

	public MultiSelectListView() {
		getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
}
