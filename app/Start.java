package app;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class Start {

	public static void main(String[] args) throws IOException {
		
		printLoginScreen();
		
		getUserInput();
		
//		test();
		
	}

	private static void getUserInput() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ch=null;
		
		System.out.println("Enter a folder path which you want to work upon or press enter to use the current directory as root folder ");
		String dir=null;
		
		while(true) {
		dir=br.readLine();
		
		if(dir.length()==0) {
			dir=System.getProperty("user.dir");
			break;
		}
		else {
			File f=new File(dir);
			if(f.exists()) {
				if(f.isDirectory()) {
					dir=f.getAbsolutePath();
					break;
				}
				else {
					System.out.println("Invalid folder path , re-enter the folder path");
				}
			}
			else {
				System.out.println("Invalid folder path , re-enter the folder path");
			}
		}
		}
		
		System.out.println("Root folder set as : "+dir);
		
		while(true){
			
		System.out.println("Enter your choice ... \n 1.Add a file to root directory \n2.Perfom business operations. \n3.Exit program ");

		try {
			ch=br.readLine();
		} catch (IOException e) {
			System.out.println("Exception occured... terminating program");
			break;
		}
		
		switch(ch) {
		case "1":
			retrieveFileNames(dir);
			break;
			
		case "2":
			BusinessOperations.performBusinessOperations(br,dir);
			break;
			
		case "3":
			System.exit(0);
			break;
		
		default:
			System.out.println("Invalid input. Enter a valid option");
		}
		
		}
		
		
	}

	private static void retrieveFileNames(String dir) {
		// TODO Auto-generated method stub
		
	}

	private static void printLoginScreen() {
		System.out.println(
		"\n *************** Welcome to Lockedme.com *********************** " +
		"\n ****************  Virtual Key Repository  ********************* " +
		"\n ************* Developer Details **************"+
		"\n Name: Ayush Krishna"+
		"\n Designation: Software Developer"+
		"\n Date: 07-05-2022"+ 
		"\n**************************************************************** " +
		"\n**************************************************************** \n\n" 
		);	
	}

}
