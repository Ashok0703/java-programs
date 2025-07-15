package linearsearch;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int [] a= {15,30,40,15,35,25,40,50,55,43,54,65,75,80,50};
		System.out.print("Enter the number to search : ");
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				c=1;
				System.out.println(n+" is found at the index "+i);
			}
			
		}
		if(c==0) {
			System.out.println("Element not  found");
		}
}
}
