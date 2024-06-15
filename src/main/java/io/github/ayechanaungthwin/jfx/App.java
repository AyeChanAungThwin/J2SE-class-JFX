package io.github.ayechanaungthwin.jfx;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;

public class App {
	
	public static void main(String[] args) throws IOException {
		JFXStarter.run(args);
	}
	
	private void file() throws IOException {
		String absolutePath = System.getProperty("user.dir");
		String folderName = absolutePath+File.separator+"src\\main\\java\\file";
		System.out.println(folderName);
		
		File file = new File(folderName);
		if (!file.exists()) {
			file.mkdir();
		}
		else {
			File oldFile = new File("C:\\Users\\User\\Desktop\\file\\java.png");
			String oldFileName = oldFile.getAbsoluteFile().getName();
			
			//Check
			File[] files = new File(folderName).listFiles();
			boolean isAlreadyExist = false;
			for(File out: files) {
				if (FileUtils.contentEquals(oldFile, out)) {
					isAlreadyExist = true;
					break;
				}
			}
			
			if (isAlreadyExist) return;
			
			File newFile = new File(folderName+"\\"+Calendar.getInstance().getTimeInMillis()+oldFileName);
			FileUtils.copyFile(oldFile, newFile);
		}
	}
}
