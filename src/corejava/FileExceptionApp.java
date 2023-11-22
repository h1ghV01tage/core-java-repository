package corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//This program won't compile if the file isn't found unless an exception is thrown

public class FileExceptionApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		openFile("C:\test.txt");
		
	}

	private static void openFile(String name) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		
			
			FileInputStream f = new FileInputStream(name);
		
			
			System.out.println("File not found");
		
		
	}
	
}
