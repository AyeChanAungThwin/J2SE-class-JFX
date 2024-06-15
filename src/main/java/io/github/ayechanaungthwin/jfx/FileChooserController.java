package io.github.ayechanaungthwin.jfx;

import java.io.File;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;

public class FileChooserController {

	private File file;
	
	@FXML
	public void chooseFile() {
		FileChooser fc = new FileChooser();
		file = fc.showOpenDialog(null);
	}
	
	@FXML
	public void openFile() {
		System.out.println(file.getAbsolutePath());
	}
}
