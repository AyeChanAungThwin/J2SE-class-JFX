package io.github.ayechanaungthwin.jfx;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private Label error;
	
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	public void login() throws IOException {
		error.setMaxWidth(Double.MAX_VALUE);
		AnchorPane.setLeftAnchor(error, 0.0);
		AnchorPane.setRightAnchor(error, 0.0);
		error.setAlignment(Pos.CENTER);
		
		if (username.getText().length()==0 && password.getText().length()==0) {
			error.setText("Please enter username and password!");
		}
		else if (username.getText().length()==0) {
			error.setText("Please enter username!");
		}
		else if (password.getText().length()==0){
			error.setText("Please enter password");
		}
		else {
			if (LoginValidator.isSuccessfulLogin(username.getText(), password.getText())) {
				//Login Successful
				goToSecondScene("Second.fxml");
			}
			else {
				error.setText("Username and password is incorrect!");
			}
		}
	}
	
	public void goToSecondScene(String fileName) throws IOException {
		Stage stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource(fileName));
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}