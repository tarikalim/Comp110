//Tevfik Tarık Alim COMP110 
import java.util.Scanner;
public class Comp110_w2_e3{
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   System.out.print("Enter your first number: ");
	   int a=in.nextInt();
	   System.out.print("Enter your second number: ");
	   int b=in.nextInt();
	   System.out.println("GCD of numbers are: " + gcd(a,b));
   }
   static int gcd(int a, int b) {
	int gcd=1;
	   for(int i = 1; i <= a && i <= b; i++)
	 {
		 if(a%i==0 && b%i==0)
		gcd=i;
		
		 
	 }
	   return gcd;
   }
}