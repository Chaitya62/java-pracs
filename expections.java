import java.util.*;


class Exceptions{


	public static void main(String args[]){
		int num1,num2;

		try{
			int a[] = new int[7];
			a[4] = 20/0;

			System.out.println("First print statenebt in try block");
			num1 = 0;
			num2 = 62/num1;
			System.out.println("Try block message");
	
		}
		catch(ArithmeticException e) {
			System.out.println("Warning: AirhtmeticException");

		
		}
		catch(ArrayIndexOutOfBoundsException e){
		
			System.out.println("Warning: Array index out of bounds Exception");
		
		}
		catch(Exception e){
		
			System.out.println("Warning: Some Other Exception");
		}
		System.out.println("I'm out of try catch block");
	
	}







}
