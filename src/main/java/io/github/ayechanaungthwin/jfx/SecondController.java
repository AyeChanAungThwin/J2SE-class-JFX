package io.github.ayechanaungthwin.jfx;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class SecondController {

	@FXML
	public void close(Event event) {
		Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		stage.close();
	}
}
