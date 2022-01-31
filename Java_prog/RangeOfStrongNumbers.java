package Java_prog;

import java.util.ArrayList;
import java.util.Scanner;


public class RangeOfStrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check range of strong numbers");
		int a=sc.nextInt();
		for(int i=1;i<a;i++) {
			System.out.println(checkstrong(i));
			if(checkstrong(i)==i) {
				System.out.print(i);
			}
		}
		

	}
	static int checkstrong(int j) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		while(j>0) {
			int t=j%10;
			ar.add(t);
			j=j/10;
		}
		ArrayList<Integer> arr=new ArrayList<Integer>();
		//System.out.println(ar);
		for(int e:ar) {
			int fact=1;
			while(e>1) {
				fact=fact*(e);
				e=e-1;
			}arr.add(fact);
		}
		//System.out.println(arr);
		int sum=0;
		for(int k:arr) {
			sum=k+sum;
		}return sum;
	}

}
