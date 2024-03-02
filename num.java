package firstproject;

import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter the input valuee: ");
	           int num= scanner.nextInt();
	           
		if(num<=0)
		{  
		System.out.println( "The number is Negative.");  
		}  
		else if (num>=0)
		{  
		System.out.println( "The number is Positive.");  
		}  
		else  
		{  
		System.out.println("The number is zero.");  
		}  
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		