package Java_prog;

import java.util.Scanner;

public class SwapOfTwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int o = 0;
		o = a;
		int p = 0;
		p = b;
		System.out.println("*****************Without using third variable*****************");
		System.out.println("Before swaping " + "a = " + a + "\n b = " + b);
		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.println("Before swaping " + "a = " + a + "\n b = " + b);
		System.out.println("*******************By using third variable*****************");
		int d = o;
		o = p;
		p = d;
		System.out.println("Before swaping " + "a = " + o + "\n b = " + p);

	}
}
