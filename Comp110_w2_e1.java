//Tevfik Tarık Alim COMP110 EX-1
import java.util.Scanner;
public class Comp110_w2_e1{
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
 System.out.println("Enter first side:");
 int side1 = in.nextInt();
 System.out.println("Enter second side:");
 int side2 = in.nextInt();
 System.out.println("Hypotenuse for given values is: " + Hypotenuse(side1,side2));
	
 
 
}
   static double  Hypotenuse(int l1,int l2) {
	double h=	Math.sqrt((l1*l1)+(l2*l2));
	return h;
	 
   }
}