package firstproject;
import java .util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter the input valuee: ");
	           int num= scanner.nextInt();
    int rem= 0;
    while(num>0)
    {
       rem=rem*10 + num%10;
       num=num/10;
    }
				System.out.println("reverse valuee is : "+ rem);
			}
    }	
	

