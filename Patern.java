package firstproject;
import java.util.Scanner;
public class Patern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no of pattern");
		int n= scanner.nextInt();
		for(int i= n; i >=1; i--) {
			for(int j=n; j>=1; j--) {
				System.out.print(Math.max(i, j));		
			}
		System.out.println();
	}
	}
}
