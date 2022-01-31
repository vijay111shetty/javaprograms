package Java_prog;

import java.util.Scanner;

public class FactorialOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to print the factorial numbers");
		int a = sc.nextInt();
		for (int j = 1; j <= a; j++) {
			System.out.println(j + "-->" + fact(j));
		}

	}

	static int fact(int n) {
		int a = 1;
		for (int i = 1; i <= n; i++) {
			a = a * i;
		}
		return a;
	}

}
