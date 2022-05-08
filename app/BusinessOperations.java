package app;

import java.io.BufferedReader;
import java.io.IOException;

public class BusinessOperations {

	public static void performBusinessOperations(BufferedReader br,String dir) throws IOException {
		
		System.out.println("Enter a choice : \n1. Add a file \n2.Delete a file \n3.Search for a file \n4.Return to main menu");
		String ch=br.readLine();
		
		switch(ch) {
			
		case "1":
			addFile(dir);
			break;
			
		case "2":
			deleteFile(dir);
			break;
		
		case "3":
			searchFile(dir);
			break;
			
		case "4":
			return;
			
		default:
			System.out.println("Enter a valid input");
		}
		
	}

	private static void searchFile(String dir) {
		// TODO Auto-generated method stub
		
	}

	private static void deleteFile(String dir) {
		// TODO Auto-generated method stub
		
	}

	private static void addFile(String dir) {
		// TODO Auto-generated method stub
		
	}
	
}
