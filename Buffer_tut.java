import java.util.*;
import java.io.*;
class Buffer_tut{
	public static void main(String[] args) throws Exception{
		// Declaring buffer
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		//Asking for user name
		System.out.println("What is your name? ");
		
		//reading user input
		String name = br.readLine();

		//printing output
		System.out.println("\nWelcome " + name);
	}

}