package pack1;
import java.util.*;
public class reverseofnumber {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n=sc.nextInt();
	int rev=0;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println("Reverse of the number : "+rev);
	}
}
