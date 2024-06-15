package io.github.ayechanaungthwin.jfx;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ComboBoxViewController implements Initializable {

	@FXML
	private TextField input;
	
	@FXML
    private ComboBox<String> comboBox;
	
	private ObservableList<String> observableList = null;
			
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		if (observableList==null) observableList = 
				FXCollections.observableArrayList("HP", "Dell", "Lenovo");
		
		comboBox.setItems(observableList);
	}

    @FXML
    void OnChosenBtnClicked() {
    	String data = comboBox.getSelectionModel().getSelectedItem();
    	System.out.println(data);
    }
    
    @FXML
    void OnRemoveItemClicked() {
    	String data = comboBox.getSelectionModel().getSelectedItem();
    	observableList.remove(data);
    }

    @FXML
    void onAddingItemClicked() {
    	if (input.getText().trim().length()==0) return;
    	observableList.add(input.getText());
    }
}
