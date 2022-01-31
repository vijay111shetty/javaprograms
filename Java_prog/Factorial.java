package Java_prog;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int a=sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++) {
			b=b*i;
		}System.out.println(b);
		System.out.println(fact(4));

	}
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return  n * fact(n-1); 
		}
	}

}
