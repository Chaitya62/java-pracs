import java.util.*;

class testFinally{

	
	public static void main(String args[]){
	
		System.out.println(testFinally.test());
	
	
	}
	
	
	
	public static int test(){
		
		try{
			return 134;
		}
		catch (Exception e){
			System.out.println("HEllo world");
	}
		
		finally{
		
			System.out.println("This is the final statement");
		}
		System.out.println("The is outside try-finally block");
	
		return 0;

	}

	
	
	
	


}
