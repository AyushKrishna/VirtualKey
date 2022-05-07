package app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) {
		
		printLoginScreen();
		
		getUserInput();
		
	}

	private static void getUserInput() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ch=null;
		
		do{
		System.out.println("Enter your choice");
		try {
			ch=br.readLine();
		} catch (IOException e) {
			//e.printStackTrace();
			break;
		}
		}while(!ch.equals("0"));
		
		
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
