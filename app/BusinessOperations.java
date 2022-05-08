package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class BusinessOperations {
	
	public static void performBusinessOperations(String dir) throws IOException {
		
		while(true) {
		System.out.println("\nEnter a business operation to perform : \n1.Add a file (will be case-insensitive) \n2.Delete a file (will be case-sensitive if the OS allows case-sensitivity) \n3.Search for a file (will be case-sensitive if the OS allows case-sensitivity) \n4.Return to main menu");
		String ch=Start.input.readLine();
		
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
	}

	private static void searchFile(String dir) throws IOException {
		System.out.println("Enter the name of file to search");
		String fname=Start.input.readLine();
		
		File f=new File(dir+File.separator+fname);
		
		if(f.exists()){	
			System.out.println("File found");
		}
		else {
			System.out.println("File does not exist");
		}
		
	}

	private static void deleteFile(String dir) throws IOException {
		System.out.println("Enter the name of file to delete");
		String fname=Start.input.readLine();
		
		File f=new File(dir+File.separator+fname);
		
		if(f.exists()){	
		boolean res=f.delete();
			if(res)
				System.out.println("File deleted successfully");
			else
				System.out.println("Unable to delete the file... please try again");
		}
		else {
			System.out.println("File not found");
		}
		
	}

	private static void addFile(String dir) throws IOException {
		System.out.println("Enter the name of file to add");
		String fname=Start.input.readLine();
		
		File f=new File(dir+File.separator+fname.toLowerCase());
		if(f.exists())
			System.out.println("File already exists");
		else {
			boolean res=f.createNewFile();
			if(res)
				System.out.println("File created successfully");
			else
				System.out.println("Unable to create new file");
		}
	}
	
}
