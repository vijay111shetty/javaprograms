package Java_prog;

import java.util.Scanner;

public class GCDofTwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=1;
		int c=Math.max(a, b);
		for(int i=2;i<c;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}System.out.println(gcd);
	}

}
