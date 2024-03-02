package firstproject;
import java.util.Scanner;

class Smallest {
    
     public static void main(String[] args) 
     {
    	 Scanner scanner = new Scanner(System.in);
         System.out.println("Enter three numbers:");
         
         double num1 = scanner.nextDouble();
         double num2 = scanner.nextDouble();
         double num3 = scanner.nextDouble();
         
         double smallest;

         if (num1 <= num2 && num1 <= num3)
         {
             smallest = num1;
         }
         else if (num2 <= num1 && num2 <= num3)
         {
             smallest = num2;
         } 
         else 
         {
             smallest = num3;
         }

         System.out.println("The smallest number is: " + smallest);

         scanner.close();
     }
 }