//Tevfik Tarýk Alim COMP110 WEEK-2 EX-2
import java.util.Scanner;
public class Comp110_w2_e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("True: second number is multiple of first number.\nFalse: Second number is not multiple of first number.");
		System.out.print("Enter how many times you want to run program: ");
		int run=in.nextInt();
		for(int i =1; i<=run;i++) {
			System.out.print("Enter first number: ");
			int a=in.nextInt();
			System.out.print("Enter second number: ");
			int b=in.nextInt();
			
			System.out.println(isMultiple(a,b));
		}
		
	}

	static boolean isMultiple(int a, int b) {
		if(b % a == 0)
			return true;
		else
			return false;

}
	}
