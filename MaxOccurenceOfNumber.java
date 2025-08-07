package Basic_Realtme_applications;
import java.util.*;
public class MaxOccurenceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements :");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:a) {
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		int lucky=-1;
		for(Map.Entry<Integer, Integer> e:map.entrySet()) {
			if(e.getKey().equals(e.getValue())) {
				lucky=Math.max(lucky, e.getKey());
			}
		}
		System.out.println("Max Occurence of The Max Number :"+lucky);
	}

}
