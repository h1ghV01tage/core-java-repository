package corejava;

import java.io.FileWriter;

//This program writes to a file and closes the file
public class FileWriterApp {
	
	public static void main(String[] args) {
		
		try(FileWriter w = new FileWriter("file.txt")) {
			
			w.write("message");
			
		}
		
		catch(Exception e) {
			
			System.out.println("File unavailable");
		}
		
	}

}
