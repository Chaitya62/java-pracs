import java.util.*;

class RollNo{
	public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter your roll no: ");
	//int rn = Integer.parseInt(in.nextLine());
	int rn = in.nextInt();
	
	System.out.println("Enter your name : ");
	//String name = in.nextLine();
	String name = in.next();
	
	System.out.println("Roll No: " + rn + "\nName: " + name);
		
}
}