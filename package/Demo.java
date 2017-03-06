import myPackage.*;
import java.util.*;

class Demo{

	public static  void main(String args[]){
		myMath test = new myMath();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the angle in degrees : ");
		double x = sc.nextDouble();
		System.out.println();
		System.out.println("Enter the number of term(n) : ");
		long n = sc.nextLong();

		double ans = test.cos(x,n);

		System.out.println("The answer is "+ans+".");

	
	
	}


}
