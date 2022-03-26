package exception;

import java.awt.Desktop;
import java.io.*;

public class FileException {
	File f = new File("C:\\index.txt");

	public void checking() throws IOException{
		if(f.exists()) {
			Desktop d =Desktop.getDesktop();
			d.open(f);
		}
		else {
			throw new FileNotFoundException("File not found");
		}
	}


	public static void main(String[] args) {
		FileException fe = new FileException();
		try {
			fe.checking();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}