package primenum1;
import java.util.*;
public class Primenum1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int flag=1;
		if(n==1) {
			flag=0;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=0;
				break;
			}
		}
		if(flag==0) {
			System.out.println(n+" is not prime number");
		}
		else {
			System.out.println(n+" is prime number");
		}
	}

}
