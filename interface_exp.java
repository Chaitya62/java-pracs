import java.util.*;

class student{
	public int rn;
	public void get_rollnumber(int r){
		rn = r;
	
	}
	public void put_rollnumber(){
		System.out.println("The Roll Number of the Student is : "+rn);
	}

}

class test extends student{

	public int math,geog,hist;
	void get_marks(int a, int b, int c){

		math = a;
		geog = b;
		hist = c;

	}
	public void put_marks(){
		System.out.println("The marks obtained are : ");
		System.out.println("Math : "+ math);
		System.out.println("Geography : " + geog);
		System.out.println("History : " + hist);
	}	

}

interface sports{

	int bonus_marks = 5;
	public void put_bonus();

}

class result extends test implements sports{

	public void put_bonus(){
	
		System.out.println("The Bonus is " + bonus_marks);

	}
	public void display(){
		put_rollnumber();
		int total = math+geog+hist+bonus_marks;
		put_marks();
		put_bonus();
		System.out.println("The total marks are : "+ total);
	}

}

class Main{

	public static void main(String[] args){
		 result R = new result();
		 R.get_rollnumber(108);
		 R.get_marks(13,2,42);
		 R.display();	 
	
	}

}
