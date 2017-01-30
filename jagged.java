import  java.util.*;



class jagged{
	
	 	
	public static void main(String[] args){
	
		//initialize Scanner object
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter the number of rows: ");
		int rows = in.nextInt();
		//Initialize jagged array
		int a[][] = new int[rows][];
		int count = 0;
		//just to have a clean output 
		System.out.println();
			
		//jagged array initailization 
		for(int i = 0;i<a.length;i++){
			a[i] = new int[i+1];
			for(int j =0;j<a[i].length;j++){
				a[i][j] = count;
				count++;
	
			}
		}

		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	
	}
}