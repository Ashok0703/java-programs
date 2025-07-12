package binarysearch;
import java .util.*;
public class BinarySearch {
	public static void bsearch(int a[],int num,int st,int sp) {
		int mid=(st+sp)/2;
		if(num==a[mid]) {
			System.out.println(num+" is found at the index : "+mid);
		}
		else if(num<a[mid]) {
			sp=mid-1;
			bsearch(a,num,st,sp);
		}
		else {
			st=mid+1;
			bsearch(a,num,st,sp);
		}
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,30,40,50,60,70,80,90,100,110,120,130,140,150};
		System.out.print("Enter the element to be search : ");
		int num=sc.nextInt();
		int st=0;
		int sp=a.length;
		bsearch(a,num,st,sp);
	}
}
