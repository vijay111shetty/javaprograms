package Java_prog;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers do you want to print");
		int a = sc.nextInt();
		int j = 0;
		int k = 1;
		System.out.print(j + "\t");
		while (a > 0) {
			int d = j + k;
			System.out.print(d + "\t");
			j = k;
			k = d;
			a--;
		}
		System.out.println("\n ************By using for loop**************");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter how many numbers do you want to print");
		int b = sc1.nextInt();
		int m;
		int n = 1, o = 0;
		System.out.print(o + "\t");
		for (int i = 0; i < b; i++) {
			m = o + n;
			System.out.print(m + "\t");
			o = n;
			n = m;
		}
	}
}
