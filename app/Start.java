package app;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Start {

	static BufferedReader input;
	
	public static void main(String[] args) throws IOException {
		
		printLoginScreen();
		
		getUserInput();
		
	}

	private static void getUserInput() throws IOException {
		input=new BufferedReader(new InputStreamReader(System.in));
		String ch=null;
		
		System.out.println("Enter a folder path which you want to work upon or press enter to use the current directory as root folder ");
		String dir=null;
		
		while(true) {
		dir=input.readLine();
		
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
			
		System.out.println("\nEnter your choice ... \n1.Display all files \n2.Perfom business operations. \n3.Exit program ");

		try {
			ch=input.readLine();
		} catch (IOException e) {
			System.out.println("Exception occured... terminating program");
			break;
		}
		
		switch(ch) {
		case "1":
			retrieveFileNames(dir);
			break;
			
		case "2":
			BusinessOperations.performBusinessOperations(dir);
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
		File[] files=new File(dir).listFiles();
		TreeSet<String> ts=new TreeSet<String>(new FileNameComparator());
		
		for(File f:files){
		if(f.isFile()) {
			ts.add(f.getName());
		}
		}
		
		System.out.println("FILES LIST : \n");
		
		Iterator<String> it=ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
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
		"\n**************************************************************** \n" 
		);	
	}

}
