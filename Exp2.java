import java.util.*;

class Exp2{
	
	public static Scanner in = new Scanner(System.in); 
	public static int matches;
		

	//Helper function to take input
	public static void getInput(int i){
	
		System.out.println("\nEnter the matches played  by " + (i+1) +" player : ");
		matches = in.nextInt();		
		System.out.println("\nEnter runs for each match: ");
		
	}	

	public static void main(String[] args){


		// read number of players		
		System.out.println("Enter the number of players : ");
		int noOfPlayers = in.nextInt();		

		//initialize jagged array
		int players[][] = new int[noOfPlayers][];
		
		for(int i = 0;i<players.length;i++){

			getInput(i);
			players[i] = new int[matches];

			for(int j = 0;j<players[i].length;j++){
				System.out.println("Enter the runs for "+ (j+1) +" match :");
				players[i][j] = in.nextInt();
				
			}
		}


		//Displaying the output 
		System.out.println("\n\nThe details of the players are : \n\n");


		for(int i = 0;i<players.length;i++){
			int sum = 0;
			System.out.println("\n\nDetails of player number "+ (i+1) +" : ");

			for(int j = 0;j<players[i].length;j++){
				System.out.println("\nThe runs scored in "+ (j+1) +" match is "+ players[i][j] +".");				
				sum += players[i][j];
			}		
			System.out.println("\n\nThe average score is "+ (float)(sum)/players[i].length +" .");	

		}
				

	}


}