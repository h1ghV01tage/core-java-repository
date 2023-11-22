package corejava;

import java.io.FileInputStream;

//This program returns true or false depending upon
//whether or not the file exists in the desired location
public class OpenFileApp {

	public static void main(String[] args) {
		
		boolean fileExists = openFile("C:\test.txt");
		
	}

	private static boolean openFile(String name) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream f = new FileInputStream(name);
			return true;
		}
		
		catch(Exception e) {
			
			
			
		}
		
		
		return false;
	}
}
