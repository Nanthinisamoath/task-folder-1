package firstproject;
import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		    
		        	       
	Scanner scanner = new Scanner(System.in);

		       System.out.print("Enter the purchase amount: ");
		       
		        double purchaseAmount = scanner.nextDouble();
		        double discount = 0.0;
		        if (purchaseAmount >= 500 && purchaseAmount <= 1000) 
		        {
		            discount = 0.1; // 10% discount
		        } 
		        else if (purchaseAmount >1000)
		        {
		            discount = 0.2; // 20% discount
		        }
		       double pAmount = purchaseAmount - (purchaseAmount * discount);
		        
		        System.out.println("Final payable amount after discount: Rs " + pAmount);
		        
		       scanner.close();
		    }
	}
