package primenum2;
import java.util.*;
public class Primenum2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n=sc.nextInt();
		int flag=0;;
		for(int i=1;i<=n;i++) {
			for(int j=2;j<i;j++) {
				flag=1;
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.println(i+" is prime number ");
			}
		}
	}
}
