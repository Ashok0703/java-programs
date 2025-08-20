package array.array2d;
import java.util.*;
public class NumbersToWord {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to change word  ; ");
		int n=sc.nextInt();
		String s="";
		while(n>0) {
			int r=n%10;
			n=n/10;
			switch(r) {
			case 1:
				s+="one ";
				break;
			case 2:
				s+="Two ";
				break;
			case 3:
				s+="Three ";
				break;
			case 4:
				s+="Four ";
				break;
			case 5:
				s+="Five ";
				break;
			case 6:
				s+="Six ";
				break;
			case 7:
				s+="Seven ";
				break;
			case  8:
				s+="Eight ";
				break;
			case 9:
				s+="Nine ";
				break;
			}
		}
		
		String str[]=s.split(" ");
		String s1="";
		for(int i=str.length-1;i>=0;i--) {
			s1+=str[i]+" ";
		}
		System.out.println("Number in sentence : "+s1);
		
	}
}
