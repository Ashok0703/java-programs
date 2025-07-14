package factorial;
import java.util.*;
public class Factorial {
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is "+ fact(n));
		

	}
	}
