/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int frequencyCount(String s, char a){
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == a) count++;
        }
        return count;
    }
    
    public static String replaceCharacter(StringBuffer sb){
          sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
          return sb.toString();
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s;
	    Scanner in = new Scanner(System.in);
		//System.out.println("Enter the string: ");
		s = in.nextLine();
		//System.out.println(s);
		//System.out.println("Enter the Character");
	    char c = in.next().charAt(0);
		int freq =  frequencyCount(s,c);
		System.out.println("The frequency of "+ c + " in "+ s +" is "+freq+".");
		
		
		//Replace Character example
		
		//System.out.println("Enter a string:")
	    StringBuffer sb = new StringBuffer();
	    sb.append(in.next());
	    
	    
	   
		s = replaceCharacter(sb);
		System.out.println("The new String is "+ s +".");
	
	}
}
