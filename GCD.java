import java.util.*;
import java.io.*;

class GCD{
	public static int gcd(int a,int b){
		if(a==0) return b;
		return gcd(b%a,a);
	}

	public static void main(String[] args) throws Exception{
		
	
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);	
		
		System.out.println("Enter the First Number: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter the Second Number: ");
		int b = Integer.parseInt(br.readLine());
		
		int c = gcd(a,b);

		System.out.println("The gcd of "+ a + " and " + b + " is " + c);
		

	}

}