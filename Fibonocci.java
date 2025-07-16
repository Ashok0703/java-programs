package fibonocci;
import java.util.*;
public class Fibonocci {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int fst=0;
		int nxt=1;
		System.out.print("Enter the number of terms : ");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series");
	    System.out.println(fst);
	    System.out.println(nxt);
		for(int i=2;i<n;i++) {
			int v=fst+nxt;
			System.out.println(v);
			fst=nxt;
			nxt=v;
			
		}
	}

}
