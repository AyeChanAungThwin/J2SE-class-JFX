package io.github.ayechanaungthwin.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JFXStarter extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub    
	    Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	    
	    primaryStage.setTitle("Login Application");
	    
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void run(String[] args) {
		launch(args);
	}
}
