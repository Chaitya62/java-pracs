import java.util.*;

class Results{

	static int marks[];
	static int noOfSubjects;
	static Scanner sc;
	static double sum;
	static boolean flag;

	public static void main(String args[]){
		flag = true;
		sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects : ");
		noOfSubjects = sc.nextInt();
		if(noOfSubjects <= 0){
			throw new ArithmeticException("The number of subjects cannot be zero or negative!");
		}
		getMarks();
		if(flag){
			double avg = sum/noOfSubjects;	
			System.out.println("The average is : "+avg+".");
		}
		else{
		
			System.out.println("Enter Integer marks only");
		}
	
	}

	public static void getMarks(){
		
		marks = new int[noOfSubjects];
		sum = 0;
		for(int i = 0;i<noOfSubjects;i++){
			try{
			  System.out.println("Enter the marks of "+(i+1)+" subject : ");
			  marks[i] = sc.nextInt();
			  sum+= marks[i];
			}
			catch (InputMismatchException e){
				flag = false;
				break;
				
			}
			
		}
	
	}



}
